environment {
resource co2_density can be triggered 
resource window can be CLOSED , OPEN
}

app security{
on co2_density is triggered
 if co2_density.state == true
 do window := OPEN
 else do 
window := CLOSED
}
