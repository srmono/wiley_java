class Animal{
    constructor(name){
        this.speed = 0;
        this.name = name
    }

    run(speed){
        this.speed = speed
    }

    stop(){
        this.speed = 0
        console.log(`${this.name} is still`)
    }
}

class Rabbit extends Animal{
    constructor(name, earsLength ){
        super(name)
        this.earsLength = earsLength;
    }

    hide(){
        console.log(`${this.name} hides`)
    }

    stop(){
        super.stop();
        this.hide()
    }
}

let rabbitOne = new Rabbit("White Rabbit", 10);