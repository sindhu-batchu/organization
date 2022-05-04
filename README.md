# organization

1. APIs for reading all employees, reading a single employee
2. APIs for reading all employees' association with projects in the organization schema
3. APIs for disassociating an employee from a project
4. Authentication and Authorization for all APIs

Sample Endpoints and payloads
1. GET all Employees:
   http://localhost:8080/employee/getEmployees
   
2. GET Employee By ID:
   http://localhost:8080/employee/getEmployee/E10001
   
3. GET all Employee Projects:
   http://localhost:8080/employeeProject/getEmployeesProjects
   
4. POST Disassociate Employee from a Project:
**!!!!!!!Once disassociated cannot be reassociated for now!!!!!!**
   
   http://localhost:8080/employeeProject/disassociateEmployee
   
   Payload pattern:
   {
    "empCode": "E10001",
    "projCode": "P1001",
    "deptCode": "D102"
   }
