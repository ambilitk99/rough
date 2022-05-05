#Shell script to read 3 numbers and test whether they can be sides of a triangle 

if [ $# -ne 3 ]
then 
  echo "try <$0> <arg1> <arg2> <arg3>"
  exit 0
fi

a=$1
b=$2
c=$3
f=0
k1=`expr $a + $b`
k2=`expr $a + $c`
k3=`expr $c + $b`
if [ $c -gt $k1 ]
then 
    f=1
    break
fi

if [ $b -gt $k2 ]
then
   f=1
   break
fi

if [ $a -gt $k3 ]
then 
  f=1
  break
fi
echo "___OUTPUT___"

if [ $f -eq 1 ]
then
  echo "THE SIDES $a $b $c YOU ENTERED CANT FORM A TRIANGLE"
else
  echo "THE SIDES $a $b $c  YOU ENTERED CAN FORM A TRIANGLE"
fi
