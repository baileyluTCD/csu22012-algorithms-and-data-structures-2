{pkgs, ...}: {
  packages = with pkgs; [
    jdt-language-server
    nil
    lemminx
  ];

  languages.java = {
    enable = true;
    maven.enable = true;
  };

  enterTest = ''
    mvn test
  '';
}
