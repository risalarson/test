
public class Test {

	public static void main(String[]args){
		Person taro=new Person();
		taro.name="山田太郎";
		taro.age=20;
		taro.phoneNumber="000-0000-0000";
		taro.address="神奈川県";

		System.out.println(taro.name);
		System.out.println(taro.age);
		System.out.println(taro.phoneNumber);
		System.out.println(taro.address);
		taro.talk();
		taro.walk();

		Person jiro=new Person();
		jiro.name="木村次郎";
		jiro.age=18;
		jiro.phoneNumber="333-3333-3333";
		jiro.address="埼玉";
		System.out.println(jiro.name);
		System.out.println(jiro.age);
		System.out.println(jiro.phoneNumber);
		System.out.println(jiro.address);

		Person hanako=new Person();
		hanako.name="鈴木花子";
		hanako.age=16;
		hanako.phoneNumber="111-1111-1111";
		hanako.address="東京";
		System.out.println(hanako.name);
		System.out.println(hanako.age);
		System.out.println(hanako.phoneNumber);
		System.out.println(hanako.address);

		Person risako=new Person();
		risako.name="三原里沙子";
		risako.age=22;
		risako.phoneNumber="222-2222-2222";
		risako.address="東京";
		System.out.println(risako.name);
		System.out.println(risako.age);
		System.out.println(risako.phoneNumber);
		System.out.println(risako.address);

		Robot aibo=new Robot();
		aibo.name="aibo";
		aibo.color="gray";
		aibo.size=130;
		System.out.println(aibo.name);
		System.out.println(aibo.color);
		System.out.println(aibo.size);
		aibo.talk();
		aibo.walk();
		aibo.run();

		Robot asimo=new Robot();
		asimo.name="asimo";
		asimo.color="black";
		asimo.size=150;
		System.out.println(asimo.name);
		System.out.println(asimo.color);
		System.out.println(asimo.size);
		asimo.talk();
		asimo.walk();
		asimo.run();

		Robot pepper=new Robot();
		pepper.name="pepper";
		pepper.color="white";
		pepper.size=1000;
		System.out.println(pepper.name);
		System.out.println(pepper.color);
		System.out.println(pepper.size);
		pepper.talk();
		pepper.walk();
		pepper.run();

	}
}
