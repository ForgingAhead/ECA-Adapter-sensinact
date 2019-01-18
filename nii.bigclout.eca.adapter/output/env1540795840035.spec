environment {
resource pollution_alert can be triggered 
resource window can be CLOSED , OPEN
}

app env{
on pollution_alert is triggered
 if pollution_alert.state == true
 do window := CLOSED
 else do 
window := OPEN
}
