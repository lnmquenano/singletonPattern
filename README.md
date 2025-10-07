# adapterPatternTwo
<h3>Software Engineering 1 | Lab Seatwork 3</h3>
<h3>Problem Statement:</h3>
You are developing a school management application that helps administrators manage various school systems such as attendance, grading, and library management. Each system has different interfaces and methods. To ensure compatibility and seamless integration, you need to create adapters for different systems to allow them to connect to the unified school management application.<br><br>

<strong>○ Adaptee Objects:</strong>
<ul>
<li>AttendanceSystem - Represents an attendance tracking system that needs to be integrated. It has the markAttendance() method.</li><br>
<li>GradingSystem - Represents a grading system that requires integration. It has the recordGrades() method.</li><br>
<li>LibrarySystem - Represents a library management system that needs to be integrated. It has the manageBooks() method.</li><br>
</ul>

<strong>○ Target Object:</strong>
<ul>
<li>SchoolManagementApp - Represents a unified school management application with a common interface for integrating systems. It defines the integrateSystem() method as the target method.</li><br>
</ul>

<strong>○ Adapter Objects:</strong>
<ul>
<li>AttendanceSystemAdapter - An adapter for integrating the attendance system into the school management application. It adapts the AttendanceSystem to the SchoolManagementApp interface, translating integrateSystem() to markAttendance().</li><br>
<li>GradingSystemAdapter - An adapter for integrating the grading system into the school management application. It adapts the GradingSystem to the SchoolManagementApp interface, translating integrateSystem() to recordGrades().</li><br>
<li>LibrarySystemAdapter - An adapter for integrating the library management system into the school management application. It adapts the LibrarySystem to the SchoolManagementApp interface, translating integrateSystem() to manageBooks().</li><br>
</ul>

<h3>UML Class Diagram:</h3>
<img width="2741" height="1770" alt="SMS_UML" src="https://github.com/user-attachments/assets/88a78bcb-c1a3-4205-b131-35ea2d7fccdd" />
