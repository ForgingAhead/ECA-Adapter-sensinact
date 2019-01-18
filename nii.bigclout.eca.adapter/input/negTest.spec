environment {
resource window can be CLOSED , OPEN
resource temperature can be WARM, COLD, HOT
}

app security{
on window is OPEN
if not temperature == HOT
do window := CLOSED

}