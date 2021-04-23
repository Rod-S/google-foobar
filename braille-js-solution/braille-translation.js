// console.log("hello");

// var  a = [
//     [1,0],
//     [0,0],
//     [0,0]
// ];
// var b = [
//     [1,0],
//     [1,0],
//     [0,0]
// ];
//
// var c = [
//     [1,1],
//     [0,0],
//     [0,0]
// ];
// var d = [
//     [1,1],
//     [0,1],
//     [0,0]
// ]
// var e = [
//     [1,0],
//     [0,1],
//     [0,0]
// ]
// var f = [
//     [1,1],
//     [1,0],
//     [0,0]
// ]
// var g = [
//     [1,1],
//     [1,1],
//     [0,0]
// ]
// var h = [
//     [1,0],
//     [1,1],
//     [0,0]
// ]
// var i = [
//     [0,1],
//     [1,0],
//     [0,0]
//
// ];
// var j = [
//     [0,1],
//     [1,1],
//     [0,0]
// ];
// var k = [
//     [1,0],
//     [0,0],
//     [1,0]
// ];
// var l = [
//     [1,0],
//     [1,0],
//     [1,0]
// ]
// var m = [
//     [1,1],
//     [0,0],
//     [1,0]
// ]
// var n = [
//     [1,1],
//     [0,1],
//     [1,0]
// ];
// var o = [
//     [1,0],
//     [0,1],
//     [1,0]
// ];
// var p = [
//     [1,1],
//     [1,0],
//     [1,0]
// ];
// var q = [
//     [1,1],
//     [1,1],
//     [1,0]
// ];
// var r = [
//     [1,0],
//     [1,1],
//     [1,0]
// ];
// var s = [
//     [0,1],
//     [1,0],
//     [1,0]
// ];
//   var  t = [
//     [0,1],
//     [1,1],
//     [1,0]
// ];
//   var u = [
//     [1,0],
//     [0,0],
//     [1,1]
// ];
//  var v = [
//     [1,0],
//     [1,0],
//     [1,1]
// ];
// var w = [
//     [1,0],
//     [1,1],
//     [1,0]
// ];
// var x = [
//     [1,1],
//     [0,0],
//     [1,1]
// ];
// var y = [
//     [1,1],
//     [0,1],
//     [1,1]
// ];
// var z = [
//     [1,0],
//     [0,1],
//     [1,1]
// ];
//  var cap = [
//     [0,0],
//     [0,0],
//     [0,1]
// ];
// var space = [
//     [0,0],
//     [0,0],
//     [0,0]
// ];

const brailleAlpha ={
    a : [
        [1,0],
        [0,0],
        [0,0]
    ], b : [
        [1,0],
        [1,0],
        [0,0]
    ], c : [
        [1,1],
        [0,0],
        [0,0]
    ], d : [
        [1,1],
        [0,1],
        [0,0]
    ], e : [
        [1,0],
        [0,1],
        [0,0]
    ], f : [
        [1,1],
        [1,0],
        [0,0]
    ],
    g : [
        [1,1],
        [1,1],
        [0,0]
    ],
    h : [
        [1,0],
        [1,1],
        [0,0]
    ], i : [
        [0,1],
        [1,0],
        [0,0]

    ],
    j : [
        [0,1],
        [1,1],
        [0,0]
    ],
    k : [
        [1,0],
        [0,0],
        [1,0]
    ],
    l : [
        [1,0],
        [1,0],
        [1,0]
    ],
    m : [
        [1,1],
        [0,0],
        [1,0]
    ],
    n : [
        [1,1],
        [0,1],
        [1,0]
    ],
    o : [
        [1,0],
        [0,1],
        [1,0]
    ],
    p : [
        [1,1],
        [1,0],
        [1,0]
    ],
    q : [
        [1,1],
        [1,1],
        [1,0]
    ],
    r : [
        [1,0],
        [1,1],
        [1,0]
    ],
    s : [
        [0,1],
        [1,0],
        [1,0]
    ],
    t : [
        [0,1],
        [1,1],
        [1,0]
    ],
    u : [
        [1,0],
        [0,0],
        [1,1]
    ],
    v : [
        [1,0],
        [1,0],
        [1,1]
    ],
    w : [
        [1,0],
        [1,1],
        [1,0]
    ],
    x : [
        [1,1],
        [0,0],
        [1,1]
    ],
    y : [
        [1,1],
        [0,1],
        [1,1]
    ],
    z : [
        [1,0],
        [0,1],
        [1,1]
    ],
    cap : [
        [0,0],
        [0,0],
        [0,1]
    ],
    " " : [
        [0,0],
        [0,0],
        [0,0]
    ]
}

var test1 = "Code";
console.log(test1);

var test2 = "The quick brown fox jumps over the lazy dog asopidopasdi asopd askdjasld jasiod asdlhjaskjldh kajdkjSHAJKd AJKSDhA KSJDHJKAsHDJKASH DKAJSH DJKASHD JKAsH DJKAS HDJKASHDKJASHDJKHAsD KAJShDKJAS HdKJHAS DKJAS HdJKASHdjioqwdjmq";
console.log(test2);

var test3= "Braille";
console.log(test3);

function stringSplitter(string) {
    return string.split("");
}
function brailleFlattener(mDArray) {
    let flatArray = [];
    for (let i =0; i<2; i++) {
        mDArray.forEach((element) => {
            flatArray.push(element[i]);
        })
    }
    return flatArray;
}
function brailleEncoder(string) {
    let stringArray = stringSplitter(string);
    let brailleNumArr = [];
    for (let i = 0; i < stringArray.length; i++) {
        for (const [key, value] of Object.entries(brailleAlpha).sort((a, b) => a[0].localeCompare(b[0]))) {
            if (key === stringArray[i].toLowerCase()) {
                if (stringArray[i] === stringArray[i].toUpperCase() && stringArray[i] !== " ") {
                    brailleNumArr.push(brailleFlattener(brailleAlpha.cap));
                }
                brailleNumArr.push(brailleFlattener(value));
                }
            }
        }
    return brailleNumArr.flat().join("");
}
console.log(brailleEncoder(test1));
// console.log(brailleEncoder(test2));
// console.log(brailleEncoder(test3));


