set class="athan.web.LocationFetcher"
set clpth=".\war\WEB-INF\classes"
set resourcedir=".\war"
set outsourcedir=".\src"
set outdir=".\war\WEB-INF\classes"
wsgen -cp %clpth% -wsdl -keep -r %resourcedir% -d %outdir% -s %outsourcedir% %class%
