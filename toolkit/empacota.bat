echo Empacotando (criando um jar) ...
rd /s /q dist
md dist
jar cvf dist\toolkit.jar -C bin .o