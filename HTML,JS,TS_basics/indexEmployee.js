class Employees {
    constructor(companyname) {
    this.companyname ="CTS";
}
}
class Developers extends Employees {
    constructor(Empname,ExEmployee,Dept,Position,JoiningDate,Location,EmailID,EmpID,Salary) {
    super();
    this.Empname = Empname;
    this.ExEmployee = ExEmployee;
    this.Dept = Dept;
    this.Position = Position;
    this.JoiningDate = JoiningDate;
    this.Location = Location;
    this.EmailID = EmailID;
    this.EmpID = EmpID;
    this.Salary = Salary;
}
}

class HR extends Employees {
    constructor(Empname,ExEmployee,Dept,Position,JoiningDate,Location,EmailID,EmpID,Salary) {
    super();
    this.Empname = Empname;
    this.ExEmployee = ExEmployee;
    this.Dept = Dept;
    this.Position = Position;
    this.JoiningDate = JoiningDate;
    this.Location = Location;
    this.EmailID = EmailID;
    this.EmpID = EmpID;
    this.Salary = Salary;
}
}

class Finance extends Employees {
    constructor(Empname,ExEmployee,Dept,Position,JoiningDate,Location,EmailID,EmpID,Salary) {
    super();
    this.Empname = Empname;
    this.ExEmployee = ExEmployee;
    this.Dept = Dept;
    this.Position = Position;
    this.JoiningDate = JoiningDate;
    this.Location = Location;
    this.EmailID = EmailID;
    this.EmpID = EmpID;
    this.Salary = Salary;
}
}

class Sales extends Employees {
    constructor(Empname,ExEmployee,Dept,Position,JoiningDate,Location,EmailID,EmpID,Salary) {
    super();
    this.Empname = Empname;
    this.ExEmployee = ExEmployee;
    this.Dept = Dept;
    this.Position = Position;
    this.JoiningDate = JoiningDate;
    this.Location = Location;
    this.EmailID = EmailID;
    this.EmpID = EmpID;
    this.Salary = Salary;
}
}

class Marketing extends Employees {
    constructor(Empname,ExEmployee,Dept,Position,JoiningDate,Location,EmailID,EmpID,Salary) {
    super();
    this.Empname = Empname;
    this.ExEmployee = ExEmployee;
    this.Dept = Dept;
    this.Position = Position;
    this.JoiningDate = JoiningDate;
    this.Location = Location;
    this.EmailID = EmailID;
    this.EmpID = EmpID;
    this.Salary = Salary;
}
}

class QA extends Employees {
    constructor(Empname,ExEmployee,Dept,Position,JoiningDate,Location,EmailID,EmpID,Salary) {
    super();
    this.Empname = Empname;
    this.ExEmployee = ExEmployee;
    this.Dept = Dept;
    this.Position = Position;
    this.JoiningDate = JoiningDate;
    this.Location = Location;
    this.EmailID = EmailID;
    this.EmpID = EmpID;
    this.Salary = Salary;
}
}

let E1 = new Developers("Sathish","TCS","Java Developer", "Team Member", "14th Nov 2022", "Chennai", "satz@gmail.com", "2247022", "5L");
let E2 = new HR("Nisanth","IBM","HR", "Team Member", "27th Feb 2020", "Bangalore", "Nis@gmail.com", "2247022", "3L");
let E3 = new Finance("Vivek","HCL","Finance", "Team Member", "30th April 2010", "Delhi", "vivek@gmail.com", "2247022", "7L");
let E4 = new Sales("Sugumaran","Wipro","Sales", "Team Member", "17th March 2018", "Chennai", "sugu@gmail.com", "2247022", "5L");
let E5 = new Marketing("Gopal","Amazon","Marketing", "Team Member", "21st Jan 2022", "Mysore", "gopal@gmail.com", "2247022", "9L");
let E6 = new QA("Vicky","TCS","QA", "Team Member", "10th Nov 2017", "Mumbai", "vivek@gmail.com", "2247022", "8L");

console.log("Developer- " +"Company Name:"+E1.companyname+" Employee Name:"+E1.Empname+" Ex-Emloyee:"+E1.ExEmployee+" Department:"+E1.Dept+" Position:"+E1.Position+" Joining Date:"+E1.JoiningDate+" Location:"+E1.Location+" Email ID:"+
E1.EmailID+" Employee ID: "+E1.EmpID+" Salaray: "+E1.Salary);

console.log("HR- " +"Company Name:"+E2.companyname+" Employee Name:"+E2.Empname+" Ex-Emloyee:"+E2.ExEmployee+" Department:"+E2.Dept+" Position:"+E2.Position+" Joining Date:"+E2.JoiningDate+" Location:"+E2.Location+" Email ID:"+
E2.EmailID+" Employee ID: "+E2.EmpID+" Salaray: "+E2.Salary);

console.log("Finance- " +"Company Name:"+E3.companyname+" Employee Name:"+E3.Empname+" Ex-Emloyee:"+E3.ExEmployee+" Department:"+E3.Dept+" Position:"+E3.Position+" Joining Date:"+E3.JoiningDate+" Location:"+E3.Location+" Email ID:"+
E3.EmailID+" Employee ID: "+E3.EmpID+" Salaray: "+E3.Salary);

console.log("Sales- " +"Company Name:"+E4.companyname+" Employee Name:"+E4.Empname+" Ex-Emloyee:"+E4.ExEmployee+" Department:"+E4.Dept+" Position:"+E4.Position+" Joining Date:"+E4.JoiningDate+" Location:"+E4.Location+" Email ID:"+
E4.EmailID+" Employee ID: "+E4.EmpID+" Salaray: "+E4.Salary);

console.log("Marketing- " +"Company Name:"+E5.companyname+" Employee Name:"+E5.Empname+" Ex-Emloyee:"+E5.ExEmployee+" Department:"+E5.Dept+" Position:"+E5.Position+" Joining Date:"+E5.JoiningDate+" Location:"+E5.Location+" Email ID:"+
E5.EmailID+" Employee ID: "+E5.EmpID+" Salaray: "+E5.Salary);

console.log("QA- " +"Company Name:"+E6.companyname+" Employee Name:"+E6.Empname+" Ex-Emloyee:"+E6.ExEmployee+" Department:"+E6.Dept+" Position:"+E6.Position+" Joining Date:"+E6.JoiningDate+" Location:"+E6.Location+" Email ID:"+
E6.EmailID+" Employee ID: "+E6.EmpID+" Salaray: "+E6.Salary);