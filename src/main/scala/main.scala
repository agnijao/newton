def abs(x: Double) = if (x > 0) x else -x

def isGoodEnough(y: Double, x: Double) = abs(y * y - x)/x < 0.0000001

def improve(y: Double, x: Double) = (y + x/y)/2

def newtonsMethod(y: Double, x: Double): Double =  {
    if (isGoodEnough(y,x)) y
    else newtonsMethod(improve(y, x), x)
}

def squareRoot(x: Double): Double  =  newtonsMethod(1, x)

//tests
print(squareRoot(4) + "\n")
print(squareRoot(16) + "\n")
print(squareRoot(25)  + "\n")