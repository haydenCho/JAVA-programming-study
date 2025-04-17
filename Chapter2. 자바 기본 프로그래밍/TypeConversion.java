public class TypeConversion {
	public static void main(String[] args) {
		byte b = 127;
		int i = 100;
		System.out.println(b+i);	// b가 int 타입으로 자동 변환(작은 타입 -> 큰 타입)
		System.out.println(10/4);	// 정수 나누기 -> 2
		System.out.println(10.0/4);	// 4가 4.0으로 자동 변환(실수 나누기 -> 2.5)
		System.out.println((char)0x12340041);	// char로 변환(범위 넘어가면 하위 2바이트만 남김) -> 0x0041 = 'A'
		System.out.println((byte)(b+i));	// 227 -> 16진수로 0xE3 = -29 (범위 넘어감 -> 227-256)
		System.out.println((int)2.9 + 1.8);	// 2 + 1.8 = 2.0(실수로 자동 변환) + 1.8 = 3.8
		System.out.println((int)(2.9 + 1.8));	// (int)4.7 = 4
		System.out.println((int)2.9 + (int)1.8);	// 2 + 1 = 3
	}
}
