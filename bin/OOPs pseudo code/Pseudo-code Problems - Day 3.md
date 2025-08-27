**Pseudo-code Problems - Day 3**





**Food Delivery System**





CLASS Customer

&nbsp;   VARIABLE name : STRING

&nbsp;   VARIABLE address : STRING



CLASS Restaurant

&nbsp;   VARIABLE name : STRING

&nbsp;   VARIABLE location : STRING



CLASS DeliveryBoy

&nbsp;   VARIABLE name : STRING

&nbsp;   VARIABLE phone : STRING



CLASS Order

&nbsp;   VARIABLE customer : Customer

&nbsp;   VARIABLE restaurant : Restaurant

&nbsp;   VARIABLE deliveryBoy : DeliveryBoy

&nbsp;   VARIABLE items : LIST<STRING>



&nbsp;   METHOD constructor(cust, rest, boy, itemList)

&nbsp;       customer = cust

&nbsp;       restaurant = rest

&nbsp;       deliveryBoy = boy

&nbsp;       items = itemList



&nbsp;   METHOD showOrderDetails()

&nbsp;       PRINT "Customer: " + customer.name + ", Address: " + customer.address

&nbsp;       PRINT "Restaurant: " + restaurant.name + ", Location: " + restaurant.location

&nbsp;       PRINT "Delivery Boy: " + deliveryBoy.name + " (" + deliveryBoy.phone + ")"

&nbsp;       PRINT "Items: " + items



MAIN

&nbsp;   cust = NEW Customer("Amit", "Delhi")

&nbsp;   rest = NEW Restaurant("Spicy Hub", "Connaught Place")

&nbsp;   boy = NEW DeliveryBoy("Ravi", "9876543210")

&nbsp;   orderItems = \["Burger", "Fries", "Coke"]



&nbsp;   order = NEW Order(cust, rest, boy, orderItems)

&nbsp;   order.showOrderDetails()





**///////////////////////////////////////////////////////////////////////////////////////////===========================================================================================**

**\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\**



**Medical Record Manager**



INTERFACE Searchable

&nbsp;   METHOD search(keyword : STRING) : BOOLEAN



INTERFACE Printable

&nbsp;   METHOD printReport()



CLASS PatientReport IMPLEMENTS Searchable, Printable

&nbsp;   VARIABLE patientName : STRING

&nbsp;   VARIABLE diagnosis : STRING



&nbsp;   METHOD search(keyword)

&nbsp;       RETURN keyword IN diagnosis OR keyword IN patientName



&nbsp;   METHOD printReport()

&nbsp;       PRINT "Patient Report: " + patientName + " - Diagnosis: " + diagnosis



CLASS LabReport IMPLEMENTS Searchable, Printable

&nbsp;   VARIABLE testName : STRING

&nbsp;   VARIABLE result : STRING



&nbsp;   METHOD search(keyword)

&nbsp;       RETURN keyword IN testName OR keyword IN result



&nbsp;   METHOD printReport()

&nbsp;       PRINT "Lab Report: " + testName + " - Result: " + result



CLASS MedicalRecordManager

&nbsp;   VARIABLE reports : LIST<Searchable>  // Can hold any type of report



&nbsp;   METHOD addReport(report)

&nbsp;       reports.add(report)



&nbsp;   METHOD searchReports(keyword)

&nbsp;       FOR each report IN reports

&nbsp;           IF report.search(keyword)

&nbsp;               CAST report TO Printable

&nbsp;               report.printReport()



MAIN

&nbsp;   mgr = NEW MedicalRecordManager()

&nbsp;   mgr.addReport(PatientReport("Rohit", "Fever"))

&nbsp;   mgr.addReport(LabReport("Blood Test", "Normal"))



&nbsp;   PRINT "Searching for 'Fever':"

&nbsp;   mgr.searchReports("Fever")



