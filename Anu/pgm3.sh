#Shell script using command line to test whether given number is prime or not

if [ $# -ne 1 ]
then 
  echo "try <$0> <arg>"
  exit 0
fi
n=$1
f=1
i=2
while [ $i -lt $n ]
do
  mod=`expr $n % $i`
  if [ $mod -eq 0 ]
  then
    f=0
    break
  fi
i=`expr $i + 1`
done
 echo "___OUTPUT___"

if [ $f -eq 0 ]
then 
   echo "Number you entered is NOT PRIME"

else

   echo "Number you entered is PRIME"

fi
