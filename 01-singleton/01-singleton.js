let counter = 0 // Global variable! Be careful! :w

class Singleton{

  static instance;

  constructor(){
    if (instance){
      throw new Error("You can only create one instance");
    }
    instance = this;
  }

  getInstance(){
    return this;
  }

  getCount(){
    return counter;

  }

  increment(){
    counter++;
  }

  decrement(){
    counter--;
  }

}

const singletonCounter = Object.freeze(new Singleton());
export default singletonCounter;
