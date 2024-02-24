const person = {
    name: "John Doe",
    age: 42,
    nationality: "American"
};

// code explains itself. This is a simple proxy that works over getters and setters.

const personProxy = new Proxy(person, {
    get: (obj, prop) => {
        if (!obj[prop]) {
            console.log(`Hmm.. this property doesn't seem to exist`);
        } else {
            console.log(`The value of ${prop} is ${obj[prop]}`);
        }
    },
    set: (obj, prop, value) => {
        if (prop === "age" && typeof value !== "number") {
            console.log(`Sorry, you can only pass numeric values for age.`);
        } else if (prop === "name" && value.length < 2) {
            console.log(`You need to provide a valid name.`);
        } else {
            console.log(`Changed ${prop} from ${obj[prop]} to ${value}.`);
            obj[prop] = value;
        }
        return true;
    }
});


personProxy.nonExistentProperty; //get
personProxy.age = "44"; // set
personProxy.name = ""; // set


// Reflect

const personProxy = new Proxy(person, {
    get: (obj, prop) => {
      console.log(`The value of ${prop} is ${Reflect.get(obj, prop)}`); //Reflect.get
    },
    set: (obj, prop, value) => {
      console.log(`Changed ${prop} from ${obj[prop]} to ${value}`);
      Reflect.set(obj, prop, value); //Reflect.set
    },
  });