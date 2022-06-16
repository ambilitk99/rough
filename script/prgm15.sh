
<<com
15. Shell script to perform a menu driven program to display
a) All ordinary files
b) All directory files
c) All special files
d) All files readable to UGO
e) All files writable to UGO
f) All files executable to UGO
com





if [ $#  -ne 0 ]
then
	echo "Syntax error"
	echo "Syntax  is <$0>"
	exit 1
fi

directry(){
	if [ -d "$1" ]
    then
     ls -l -d "$1"
    else
			ls -l "$1"
	fi
}



while :
do
echo "\n1.ordinary files"
echo "2.Directory files"
echo "3.Special files"
echo "4.Readable files for UGO"
echo "5.Writable files for UGO"
echo "6.Executable files for UGO"
echo "---------------------------"
echo "\nselect your option:"
read opt


ls -l > lsl
ter=`tty`
case $opt in

1) echo "\nordinary files\n"
for file in *
do
	if [ -f "$file" ]
	then
		ls -l "$file"
	fi
done
;;
2) echo "\ndirectory files\n"
for file in *
do
        if [ -d "$file" ]
        then
                ls -l -d "$file"
        fi
done
;;
3) echo "\nSpecial files\n"
for file in *
do
        if [ -s "$file" ]
        then
        	directry "$file"
        	
        fi
done
;;
4) echo "\nReadable files for UGO\n"
exec < lsl
while read line
	
	do
		echo $line | grep .r..r..r.. > /dev/null
		if [ $? -eq 0 ]
		then
			fn=`echo $line | cut -d " " -f 9-`
			directry "$fn"
			
		fi
done
exec < $ter
;;
5) echo "\nwritable files for UGO\n"
	exec < lsl
	while read line
	do
		echo $line | grep ..w..w..w. > /dev/null
		if [ $? -eq 0 ]
		then
			fn=`echo $line | cut -d " " -f 9-`
			directry "$fn"
		fi
done
exec < $ter
;;
6) echo "\nExicutable files for UGO\n"
exec < lsl
	while read line
	do
		echo $line | grep ...x..x..x > /dev/null
		if [ $? -eq 0 ]
		then
			fn=`echo $line | cut -d " " -f 9-`
			directry "$fn"
		fi
        
done
exec < $ter
;;
*)	rm lsl	
	exit 0
;;
esac
done





<<comm

1.ordinary files
2.Directory files
3.Special files
4.Readable files for UGO
5.Writable files for UGO
6.Executable files for UGO
---------------------------

select your option:
1

ordinary files

-rw-rw-r-- 1 ksb ksb 88 Jun 16 11:25 111
-rw-rw-r-- 1 ksb ksb 88 Jun 13 10:31 123
-rw-rw-r-- 1 ksb ksb 0 May 19 12:09 55
-rw-rw-r-- 1 ksb ksb 88 Jun 13 14:20 aaa
-rw-rw-r-- 1 ksb ksb 88 May 26 12:55 abc
-rw-rw-r-- 1 ksb ksb 67 May 26 12:58 ac
-rw-rw-r-- 1 ksb ksb 88 Jun  6 15:22 bat
-rw-rw-r-- 1 ksb ksb 309 Jun  1 14:18 exam1.sh
-rw-rw-r-- 1 ksb ksb 804 Jun 13 10:32 exp13.sh
-rw-rw-r-- 1 ksb ksb 24 Jun  1 12:00 linux
-rw-rw-r-- 1 ksb ksb 1396 Jun 16 11:25 lsl
-rw-rw-r-- 1 ksb ksb 83 May 26 12:56 newfile
-rwxrwxrwx 1 ksb ksb 610 May  5 13:02 prgm1.sh
-rw-rw-r-- 1 ksb ksb 1738 Jun  6 15:43 prgm10.sh
-rw-rw-r-- 1 ksb ksb 891 Jun  9 12:24 prgm11.sh
-rw-rw-r-- 1 ksb ksb 720 Jun  1 11:34 prgm12.sh
-rw-rw-r-- 1 ksb ksb 804 Jun 13 10:34 prgm13.sh
-rw-rw-r-- 1 ksb ksb 810 Jun 13 14:21 prgm14.sh
-rw-rw-r-- 1 ksb ksb 1772 Jun 13 14:29 prgm15.sh
-rw-rw-r-- 1 ksb ksb 471 Jun 13 15:00 prgm16.sh
-rw-rw-r-- 1 ksb ksb 822 May 19 11:43 prgm2.sh
-rw-rw-r-- 1 ksb ksb 638 May 26 11:37 prgm3.sh
-rw-rw-r-- 1 ksb ksb 855 May 16 15:15 prgm4
-rw-rw-r-- 1 ksb ksb 604 May 26 12:40 prgm5.sh
-rw-rw-r-- 1 ksb ksb 486 May 16 15:35 prgm6.sh
-rw-rw-r-- 1 ksb ksb 511 May 26 13:05 prgm7.sh
-rw-rw-r-- 1 ksb ksb 899 May 19 12:10 prgm8.sh
-rw-rw-r-- 1 ksb ksb 661 May 28 12:20 prgm9.sh
-rw-rw-r-- 1 ksb ksb 88 Jun 16 11:20 s
-rw-rw-r-- 1 ksb ksb 96 May 26 12:56 xyz

1.ordinary files
2.Directory files
3.Special files
4.Readable files for UGO
5.Writable files for UGO
6.Executable files for UGO
---------------------------

select your option:
2

comm
