environment {
resource pollution_alert can be triggered 
resource window can be CLOSED , OPEN resource   co2_density   can be   triggered }

app env{
on pollution_alert is triggered
 if pollution_alert.state == true
 and   co2_density .state ==   true 
  do window := CLOSED
 else do 
window := OPEN
}
