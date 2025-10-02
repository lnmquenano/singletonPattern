# adapterPattern
Software Engineering 1 | Lab Assignment 3
<h3>Problem Statement:</h3>
You are developing an application that helps users manage and control various electronic devices by plugging them into power outlets. Each device has different plug types, voltage, and amperage requirements. To ensure compatibility and safety, you need to create adapters for different devices to allow them to be plugged into standard power outlets.<br><br>

<strong>Adaptee Objects:</strong>

• Laptop - Represents a laptop device that needs to be plugged into a power source. It has the charge() method.

• Refrigerator - Represents a refrigerator device that requires a power source. It has the startCooling() method.

• SmartphoneCharger - Represents a smartphone charger that needs to be plugged in for charging. It has the chargePhone() method.<br><br>

<strong>Target Object:</strong>

• PowerOutlet - Represents a standard power outlet with a common interface for plugging in devices. It defines the plugIn() method as the target method.<br><br>

<strong>Adapter Objects:</strong>

• LaptopAdapter - An adapter for plugging a laptop into a standard power outlet. It adapts the Laptop to the PowerOutlet interface, translating plugIn() to charge().

• RefrigeratorAdapter - An adapter for plugging a refrigerator into a standard power outlet. It adapts the Refrigerator to the PowerOutlet interface, translating plugIn() to startCooling().

• SmartphoneAdapter - An adapter for plugging a smartphone charger into a standard power outlet. It adapts the SmartphoneCharger to the PowerOutlet interface, translating plugIn() to chargePhone().

<h3>UML Class Diagram:</h3>
