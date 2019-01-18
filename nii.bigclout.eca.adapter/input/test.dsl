EnvironmentMetaData
	resource window can be OPEN, CLOSED
	
	resource co2_density can be HIGH, MEDIUM, LOW
	
	resource airPollution_alert can be ON, OFF
	
	resource AC_room1 can be ON, OFF

AppMeta SafetyAppMeta {
	spec1
	on airPollution_alert == ON
	if 
	do window := close and AC_room1 := ON
}

AppMeta EnvironmentAppMeta {
	spec1
	on 
	if co2_density >= 40
	do window := open
}

ConceptToCodeMappings {
	(window, close, window.Close.act())
	(window, open, window.Open.act())
}