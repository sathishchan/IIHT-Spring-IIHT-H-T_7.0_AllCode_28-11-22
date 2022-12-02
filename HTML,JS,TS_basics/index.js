var name = "Sathish";
        var age = 32;
        var isGraduate = true;
        var laptop;
        laptop = "IG";
        console.log(name);

        function alertuser() {
             //var favchips="Lays blue"
            alert("This user is logged in " + name)
        }
        //alertuser();
        //console.log(favchips);

        //if else and else if statement
        function operators(num){
            if (num>20){
                console.log("Number greater than 20");
             } else if (num == 20) {
                console.log("Number is equal to 20");  
                } else {
                    console.log("Number is smaller than 20");
                }
            }
         operators(19);
        
            function creditLimit(score) {
                var creditLimit;
                switch(score) {
                    case 800: creditLimit="above 1 Lakhs";
                    break;
                    case 700: creditLimit="50,000 to 1,00,000";
                    break;
                    case 600: creditLimit="10,000 to 50,000";
                    break;
                    default: creditLimit="Not Eligible";
                }
                console.log(creditLimit);
            }
            function counting() {
                for (i=1; i<=10; i++) {
                    console.log(i);
                }
            }

            var car = new Object();
            car.brand = "Mercedes"
            car.model = "C Class"
            car.price = 600000

            console.log(car);

            //Arrays
            var names = ["Sathish","sugu","vivek"];
            console.log(names);
            counting();
            creditLimit(900);

            //class Car {
            let Car = class {
                //inialize any object
                constructor(brand, modelname, price) {
                    this.brand = brand;
                    this.modelname = modelname;
                    this.price = price;
                }
                print() {
                    console.log("This is a " + this.brand +" "+this.
                    modelname +" Which Costs: " +this.price);
                }
            }
            var c1= new Car("Toyato","A class",700000);
            var c2= new Car("BMW","3-series",500000);
            c1.print();
            c2.print();


            class TodaysDate extends Date { //example to make a class a child class of a inbuild js class
                constructor() {
                    super();
                }
                printDate() {
                   console.log(this.getDate());
                }
            }
            let today = new TodaysDate();
            today.printDate();

            class AppleLaptops {
                constructor(brand) {
                    this.brand="Apple";
                }
            }

            class MacBookPro extends AppleLaptops {
                constructor(model,processor,ram) {
                    super();
                    this.model = model;
                    this.processor = processor;
                    this.ram = ram;
                }
            }
            let v1 = new MacBookPro("2021 I5 Macbook Pro","i7",16)
            console.log(v1.brand+" "+v1.model+" "+v1.processor+" "+v1.ram);

            let fruits = ["Apple", "Bananna", "Orange"]
            let seasonfruits = ["Mango", "Lichi"]
            let Allfruits = [...fruits, ...seasonfruits] //... This is the spread operator and it copies
            //all the elements of the array named after the use of ...
            console.log(Allfruits);

            let counts = ()  => { //this is how you define an inline / arrow function
                for (let i=1; i<=5; i++) {
                console.log(i);
                }
            }
            counts();

            // there are three keywords that can be used to declare a variable in javascript
            // var -> this has a scope of a function , it can be re-declared
            var num1 = 1000;
            var num1 = 2000;
            console.log(num1);

            //Let keyword -> was announced with es6, it has a block scope, a variable declared using let
            //cannot be re-defined
            let a = 100;
            function addnumbers() {
                a=230;
                let b = 100;
                console.log(a+b);
            }
            addnumbers();
            console.log(a + 1000);

            //const -> it stands for contact so you cannot change the value directly , this also has a scope
            // of block.
            function addnumbers1() {
                const num3 = 230;
                //const num3 = 900;
                console.log(num3);
            }
            addnumbers1();

            function dogs() {
                this.dogname = "Lab"
                throw new error("This is not a wild dog");
            }
            //Abstract Method
            dogs.prototype.display= function() {
                return "this dogs breed is :" + this.dogname;
            }

            //constructor function
            function Animal(dogname) {
                this.dogname = dogname
            }

            // Create an object without using the constructor
            Animal.prototype= Object.create(dogs.prototype)
            let tommy = new Animal("German Shepherd")
            console.log(tommy.display());

            function Greet() {
                alert("Greeting fellow Developers")
            }



           


