if [ $# -ne 0 ]
then
	echo "syntax error"
	exit 1 
fi

fact()
	{
	n=$1
	i=1
	f=1

	while [ $i -le $n ]
	do
     	f=`expr $f \* $i`
	i=`expr $i + 1`
	done
	return $f
	}

echo "enter n: "
read p
fact $p
a=$?


echo "enter r: "
read r
fact $r
b=$?


c=`expr $p - $r` 
fact $c
d=$?


t=`expr $b \* $d`

res=`expr $a / $t`

echo "ncr of $p & $r = $res"

