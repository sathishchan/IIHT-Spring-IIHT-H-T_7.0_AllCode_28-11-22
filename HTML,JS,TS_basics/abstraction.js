function Car(color, model, cost, fueltype) {
    this.color = color;
    this.model = model;
    this.cost = cost;
    this.fueltype = fueltype;
    let runningCostPerYear = 30000

    this.getcardetails = function() {
        console.log("color :" +this.color);
        console.log("model :" +this.model);
        console.log("Cost :" +this.cost);
        console.log("FuelType: " +this.fueltype);
        console.log("RunningCostPerYear: " +this.runningCostPerYear);      
    }

    this.TotalCostOfOwnerShip = function() {
        console.log(runningCostPerYear + cost);
    }
}

let MercedescClass = new Car("Black", "2022", 2000, "Petrol");
MercedescClass.getcardetails();
//MercedescClass.runningCostPerYear=90000;
console.log(MercedescClass.TotalCostOfOwnerShip());