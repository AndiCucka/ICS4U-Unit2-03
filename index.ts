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

let colors = new CarStack()
colors.push("red")
colors.push("green")
colors.push("blue")
console.log("colors: " + colors.showStack)
console.log("popped: " + colors.popItem())
console.log("popped: " + colors.popItem())
console.log("colors: " + colors.showStack)
console.log("length: " + colors.size)
console.log("is empty: " + colors.isEmpty)
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

