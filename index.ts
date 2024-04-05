/**
 * This is the standard index.ts starting point.
 *
 * author  Andi Cucka
 * version 1.0
 * since   2024-03-19
 */
import { CarStack } from './CarStack'

let fruits = new CarStack()
fruits.push("apple")
fruits.push("banana")
fruits.push("cherry")
console.log("fruits: " + fruits.showStack)
console.log("popped: " + fruits.popItem())
console.log("fruits: " + fruits.showStack)
console.log("length: " + fruits.size)
console.log("is empty: " + fruits.isEmpty)
console.log("")

let colours = new CarStack()
colours.push("red")
colours.push("green")
colours.push("blue")
console.log("colours: " + colours.showStack)
console.log("popped: " + colours.popItem())
console.log("popped: " + colours.popItem())
console.log("colours: " + colours.showStack)
console.log("length: " + colours.size)
console.log("is empty: " + colours.isEmpty)
console.log("")

let cars = new CarStack()
cars.push("Mazda")
cars.push("BMW")
cars.push("Ford")
console.log("cars: " + cars.showStack)
console.log("popped: " + cars.popItem())
console.log("popped: " + cars.popItem())
console.log("popped: " + cars.popItem())
console.log("popped: " + cars.popItem())
console.log("cars: " + cars.showStack)
console.log("length: " + cars.size)
console.log("is empty: " + cars.isEmpty)
console.log("")

console.log("\nDone.")



