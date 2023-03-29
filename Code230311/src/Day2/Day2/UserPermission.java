package Day2.Day2;

/*
设计一套权限管理系统,有 读取r 写入w 执行x
用户的权限可以是 0/r/w/x/rw/rx/wx/rwx

*/

public class UserPermission {
    public static void main(String[] args){

        int userPermission = 6;

        //方法一:使用if-else分支结构
        if(userPermission == 0){
            System.out.println("用户的权限是0,没有任何权限");
        }else if(userPermission == 1){
            System.out.println("用户的权限是1,仅可以读取");
        }else if(userPermission == 2){
            System.out.println("用户的权限是2,仅可以写入");
        }else if(userPermission == 3){
            System.out.println("用户的权限是3,仅可以运行");
        }else if(userPermission == 4){
            System.out.println("用户的权限是4,既可以读取,也可以写入");
        }else if(userPermission == 5){
            System.out.println("用户的权限是5,既可以写入,也可以执行");
        }else if(userPermission == 6){
            System.out.println("用户的权限是6,既可以读取,也可以写入,还可以执行");
        }else{
            System.out.println("用户权限输入不正确,请重新输入");
        }




	/*
	方法二:
	//使用switch分支结构
	switch(userPermission){
		case 0:
		System.out.println("用户的权限是0,没有任何权限");
		break;

		case 1:
		System.out.println("用户的权限是1,仅可以读取");
		break;

		case 2:
		System.out.println("用户的权限是2,仅可以写入");
		break;

		case 3:
		System.out.println("用户的权限是3,仅可以运行");
		break;

		case 4:
		System.out.println("用户的权限是4,既可以读取,也可以写入");
		break;

		case 5:
		System.out.println("用户的权限是5,既可以写入,也可以执行");
		break;

		case 6:
		System.out.println("用户的权限是6,既可以读取,也可以写入,还可以执行");
		break;

		default:
		System.out.println("用户权限输入不正确,请重新输入");
	    break;

		}
		*/

    }

}