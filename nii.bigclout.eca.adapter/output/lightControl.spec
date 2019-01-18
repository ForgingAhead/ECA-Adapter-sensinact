environment {
resource button can be triggered 
resource light can be OFF , ON
}

app lightControl{
on button is triggered
 if button.state == true
 do light := ON
 else do 
light := OFF
}
