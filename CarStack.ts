/**
 * The CarStack Class.
 *
 * author  Andi Cucka
 * version 1.0
 * since   2024-03-26
 */

export class CarStack {

  /*
  * The constructor for the CarStack string stack class.
  */
  constructor() {
    this.strStack = []
  }

  /*
  * Checks if stack is empty.
  */
  public get isEmpty() {
    return this.strStack.length == 0
  }

  /*
  * returns stack size
  */
  public get size() {
    return this.strStack.length
  }
  
  /*
  * returns the stack as a string
  */
  public get showStack() {
    let values = ""
    for (let counter = 0; counter < this.strStack.length; counter++) {
      values = values + this.strStack[counter] + ", "
    }
    values = values.substring(0, values.length-2)
    return values
  }

  /*
  * pushes a string onto the stack
  */
  public push(input) {
    this.strStack.push(input)
  }

  /*
  * pops a string from the stack
  */
  public popItem() {
    let removed = ""
    // checks if there's at least 1 element in the stack
    if (self.strStack.length > 0) {
      removed = self.strStack[self.strStack.length - 1]
    } else {
      removed = "nothing to remove";
    }
    return removed;
  }
}
