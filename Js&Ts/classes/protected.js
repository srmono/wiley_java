class CoffeeMachine{
    _waterAmount = 0;
    #waterLimit = 200;

    #fixWaterAmount(value){
        if(value < 0) value = 0;
        if(value > this.#waterLimit) return this.#waterLimit;
    }

    setWaterAmount(value){
        this.#waterLimit = this.#fixWaterAmount(value);
    }

    getWaterAmount(){
        return this._waterAmount;
    }
}

var machine = new CoffeeMachine();

machine.setWaterAmount(100);

console.log(machine.getWaterAmount())
