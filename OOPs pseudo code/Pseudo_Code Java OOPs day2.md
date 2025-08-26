**Pseudo-code Problems - Day 2**



**Java OOPs**



**1. Traffic Signal Simulation**



ENUM TrafficLight { RED, GREEN, YELLOW }



CLASS TrafficSignal

&nbsp;   VARIABLE currentLight : TrafficLight

&nbsp;   VARIABLE timeInterval : INTEGER   



&nbsp;   METHOD constructor(initialLight, interval)

&nbsp;       currentLight = initialLight

&nbsp;       timeInterval = interval



&nbsp;   METHOD changeLight()

&nbsp;       SWITCH currentLight

&nbsp;           CASE RED:

&nbsp;               currentLight = GREEN

&nbsp;           CASE GREEN:

&nbsp;               currentLight = YELLOW

&nbsp;           CASE YELLOW:

&nbsp;               currentLight = RED



&nbsp;   METHOD startSimulation(cycles)

&nbsp;       FOR i FROM 1 TO cycles

&nbsp;           PRINT "Light: " + currentLight

&nbsp;           WAIT timeInterval seconds

&nbsp;           changeLight()



MAIN

&nbsp;   signal = NEW TrafficSignal(RED, 5)

&nbsp;   signal.startSimulation(6)







**/////////////////////////////////////////////////////////////////////////////////////**

**====================================================================================**

**\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\**



**Smart Farming System**



ABSTRACT CLASS Crop

&nbsp;   METHOD getWaterRequirement() : INTEGER 

&nbsp;   METHOD harvest() : STRING



CLASS Rice EXTENDS Crop

&nbsp;   METHOD getWaterRequirement()

&nbsp;       RETURN 5000

&nbsp;   METHOD harvest()

&nbsp;       RETURN "Harvesting rice in September."



CLASS Wheat EXTENDS Crop

&nbsp;   METHOD getWaterRequirement()

&nbsp;       RETURN 3000

&nbsp;   METHOD harvest()

&nbsp;       RETURN "Harvesting wheat in March."



MAIN

&nbsp;   crops = \[ NEW Rice(), NEW Wheat() ]

&nbsp;   FOR crop IN crops

&nbsp;       PRINT crop.harvest()

&nbsp;       PRINT "Water needed: " + crop.getWaterRequirement() + " liters/acre"





