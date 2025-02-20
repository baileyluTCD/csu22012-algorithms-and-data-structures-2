{pkgs, ...}: {
  languages.java = {
    enable = true;
    maven.enable = true;
  };

  scripts.strip-submission = {
    package = pkgs.nushell;
    binary = "nu";
    exec =
      # bash
      ''
        # Produce a submitty prepared submission file
        #
        # Dumps java files with no package information into `submission/`
        def main [location: path] {
          let root = $env.DEVENV_ROOT
          let submission = $root | path join submission

          if not ( $location | path join pom.xml | path exists ) {
              print "No pom.xml found at the specified location. Try switching to the root of a Maven project."
              exit 1
          }

          rm $submission -rf
          mkdir $submission

          let java_files = glob ($location | path join src/main/java/**/*.java)
          for file in $java_files {
            let name = $file | path basename
            let out = $submission | path join $name

            open $file | str replace "package ie.tcd.baileylu;\n\n" "" | save $out
          }

          print "Successfully produced submission files"
        }
      '';
  };
}
