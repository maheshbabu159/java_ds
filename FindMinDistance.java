import Foundation

/* 
Your previous Plain Text content is preserved below:

import Foundation

for _ in 1...5 {
  print("Hello, World!")
}
/*
Given an array of strings S and two words w1 and w2 that are present in S. The task is to find the minimum distance between w1 and w2. Here distance is the number of steps or words between the first and the second word. S can have duplicate strings

example input:
S = ["paypal", "ios", "hiring", "swift", "paypal"]
w1 = "paypal"
w2 = "swift"

example output:
minDistance(w1, w2) = 0  // As "swift" & "paypal" are adjacent to each other
*/

. Search for both string by iterating through array using or condition
. Save the found string and start increasing the distance from there to find next work


*/

func findMinDistance(_ array:[String], _ w1:String, _ w2: String) -> Int {
  var minDistance = 455677
  
  var referanceW1:String?
  var referanceW2:String?

  var tempIndex1 = -1
  var tempIndex2 = -1
  for index in 0..<array.count  {
    let string1 = array[index]
    print("String1 = \(string1)") 
    let string2 = array[index]
    print("String2 = \(string2)") 
    
    if w1 == string1 {
      referanaceW1 = string1
      tempIndex1 = index
    }
    
    if w2 == string2 {
      referanceW2 = string2
      tempIndex2 = index
    }
    
    if tempIndex1 >= 0 && tempIndex2 >= 0 {
      
      let diff = abs(tempIndex2 - tempIndex1)
      print(diff)
      if diff < minDistance {
        minDistance = diff - 1
      }
    }
  }
  
  return minDistance
}


let S = ["paypal", "ios", "hiring", "paypal", "hi", "hi", "swift"]
let w1 = "paypal"
let w2 = "swift"

let result = findMinDistance(S, w1, w2)
print(result)