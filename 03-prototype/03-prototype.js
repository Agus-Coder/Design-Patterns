class Dog {
    constructor(name) {
        this.name = name;
    }

    bark() {
        return `Woof!`;
    }
}


const dog1 = new Dog("Daisy");
const dog2 = new Dog("Max");
const dog3 = new Dog("Spot");

Dog.prototype.play = () => console.log("Playing now!"); // JS prototype is far less complex

dog1.play();

// We can have a prototype chain, meaning that there could be more than one step:

class SuperDog extends Dog {
    constructor(name) {
        super(name);
    }

    fly() {
        console.log(`Flying!`);
    }
}

const superDog = new SuperDog("Daisy");

superDog.bark();
superDog.fly();