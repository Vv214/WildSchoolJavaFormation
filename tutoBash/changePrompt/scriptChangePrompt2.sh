#!/bin/bash
# say hello
echo "Welcome ! What is the color you want for the prompt ?"
echo -e "\033[0;34m 1) blue \033[0;37m// \033[0;31m 2) red \033[0;37m// \033[0;33m 3) yellow \033[0;37m"
# set the Value of the prompt
read color
case $color  in
	1)
		echo "blue"
		PROMPT="\033[0;34m "
	;;
	2)
		echo "red"
		PROMPT="\033[0;31m "
	;;
	3)
		echo "yellow"
		PROMPT="\033[0;33m "
	;;
		*) echo "Thx to choose one of this color."
	;;
	esac
echo "Do you want to have the time ?"
echo "1)Yes // 2)No"
read time
case $time in
	1) 
		PROMPT="$PROMPT + \t"
	;;
	2)
		PROMPT="$PROMPT"
	;;
	*)
		echo "Thx to choose 1 or 2 ! "
	;;
	esac
echo "export PS1='$PROMPT \u@\h:\w \n\$\033[0;37m '"> ~/.prompt
source ~/.prompt
echo $PROMPT
