package execution1;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;

public class Fonksiyonlar {

	public String[] tokenize(BufferedReader br) throws IOException {
		StringBuilder currentToken = new StringBuilder();
		int character;

		boolean isNewLine = true;

		while ((character = br.read()) != -1) {
			if (Character.isWhitespace(character) || character == 10 || isPunctuation(character)) {
				if (!isNewLine) {
					currentToken.append(' ');
					isNewLine = true;
				}
			} else {
				currentToken.append((char) character);
				isNewLine = false;
			}
		}

		return currentToken.toString().split(" ");
	}

	public boolean isPunctuation(int character) {
		return character == ',' || character == '.' || character == ';' || character == ':' || character == '!'
				|| character == '?' || character == '"' || character == '-';
	}

	public static int sign = 7;
	public static int zero = 7;
	public static int AX = 0;
	public static int BX = 0;
	public static int CX = 0;
	public static int DX = 0;
	private Scanner sc;

	public void YAZ(String s1) {

		if (s1.equals("AX")) {
			System.out.println("AX in değeri: " + AX);
		} else if (s1.equals("BX")) {
			System.out.println("BX in değeri: " + BX);
		} else if (s1.equals("CX")) {
			System.out.println("CX in değeri: " + CX);
		} else if (s1.equals("DX")) {
			System.out.println("DX in değeri: " + DX);
		} else {
			int x = Integer.parseInt(s1);
			System.out.println(x);
		}

	}

	public void HRK(String s1, String s2) {

		if (s1.equals("AX")) {
			if (s2.equals("BX")) {
				AX = BX;
			} else if (s2.equals("CX")) {
				AX = CX;
			} else if (s2.equals("DX")) {
				AX = DX;
			} else {
				AX = Integer.parseInt(s2);
			}
		} else if ("BX".equals(s1)) {
			if ("AX".equals(s2)) {
				BX = AX;
			} else if ("CX".equals(s2)) {
				BX = CX;
			} else if ("DX".equals(s2)) {
				BX = DX;
			} else {
				BX = Integer.parseInt(s2);

			}
		} else if ("CX".equals(s1)) {
			if ("BX".equals(s2)) {
				s1 = s2;
			} else if ("AX".equals(s2)) {
				s1 = s2;
			} else if ("DX".equals(s2)) {
				s1 = s2;
			} else {
				CX = Integer.parseInt(s2);
			}
		} else if ("DX".equals(s1)) {
			if ("BX".equals(s2)) {
				DX = BX;
			} else if ("CX".equals(s2)) {
				DX = CX;
			} else if ("AX".equals(s2)) {
				DX = AX;
			} else {
				DX = Integer.parseInt(s2);
			}
		}
	}

	public void TOP(String s1, String s2) {

		if (s1.equals("AX")) {
			if (s2.equals("BX")) {
				AX = AX + BX;
			} else if ("CX".equals(s2)) {
				AX = AX + CX;
			} else if ("DX".equals(s2)) {
				AX = AX + DX;
			} else {
				AX = AX + Integer.parseInt(s2);
			}
		} else if ("BX".equals(s1)) {
			if ("AX".equals(s2)) {
				BX = BX + AX;
			} else if ("CX".equals(s2)) {
				BX = BX + CX;
			} else if ("DX".equals(s2)) {
				BX = BX + DX;
			} else {
				BX = BX + Integer.parseInt(s2);
			}
		} else if ("CX".equals(s1)) {
			if ("BX".equals(s2)) {
				CX = CX + BX;
			} else if ("AX".equals(s2)) {
				CX = CX + AX;
			} else if ("DX".equals(s2)) {
				CX = CX + DX;
			} else {
				CX = CX + Integer.parseInt(s2);
			}
		} else if ("DX".equals(s1)) {
			if ("BX".equals(s2)) {
				DX = DX + BX;
			} else if ("CX".equals(s2)) {
				DX = DX + CX;
			} else if ("AX".equals(s2)) {
				DX = DX + AX;
			} else {
				DX = DX + Integer.parseInt(s2);
			}
		}

	}

	public void CIK(String s1, String s2) {

		if (s1.equals("AX")) {
			if (s2.equals("AX")) {
				sign = 0;
				zero = 1;
				AX = AX - AX;
			} else if (s2.equals("BX")) {
				if (AX > BX) {
					sign = 0;
					zero = 0;
				} else if (AX == BX) {
					sign = 0;
					zero = 1;
				} else {
					sign = 1;
					zero = 0;
				}
				AX = AX - BX;
			} else if (s2.equals("CX")) {
				if (AX > CX) {
					sign = 0;
					zero = 0;
				} else if (AX == CX) {
					sign = 0;
					zero = 1;
				} else {
					sign = 1;
					zero = 0;
				}
				AX = AX - CX;
			} else if ("DX".equals(s2)) {
				if (AX > DX) {
					sign = 0;
					zero = 0;
				} else if (AX == DX) {
					sign = 0;
					zero = 1;
				} else {
					sign = 1;
					zero = 0;
				}
				AX = AX - DX;
			} else {
				int d = Integer.parseInt(s2);
				if (AX > d) {
					sign = 0;
					zero = 0;
				} else if (AX == d) {
					sign = 0;
					zero = 1;
				} else {
					sign = 1;
					zero = 0;
				}
				AX = AX - d;
			}
		} else if ("BX".equals(s1)) {
			if (s2.equals("BX")) {
				sign = 0;
				zero = 1;
				BX = BX - BX;
			} else if ("AX".equals(s2)) {
				if (BX > AX) {
					sign = 0;
					zero = 0;
				} else if (BX == AX) {
					sign = 0;
					zero = 1;
				} else {
					sign = 1;
					zero = 0;
				}
				BX = BX - AX;
			} else if ("CX".equals(s2)) {
				if (BX > CX) {
					sign = 0;
					zero = 0;
				} else if (BX == CX) {
					sign = 0;
					zero = 1;
				} else {
					sign = 1;
					zero = 0;
				}
				BX = BX - CX;
			} else if ("DX".equals(s2)) {
				if (BX > DX) {
					sign = 0;
					zero = 0;
				} else if (BX == DX) {
					sign = 0;
					zero = 1;
				} else {
					sign = 1;
					zero = 0;
				}
				BX = BX - DX;
			} else {
				int d = Integer.parseInt(s2);
				if (BX > d) {
					sign = 0;
					zero = 0;
				} else if (BX == d) {
					sign = 0;
					zero = 1;
				} else {
					sign = 1;
					zero = 0;
				}
				BX = BX - d;
			}
		} else if ("CX".equals(s1)) {
			if (s2.equals("CX")) {
				sign = 0;
				zero = 1;
				CX = CX - CX;
			} else if ("BX".equals(s2)) {
				if (CX > BX) {
					sign = 0;
					zero = 0;
				} else if (CX == BX) {
					sign = 0;
					zero = 1;
				} else {
					sign = 1;
					zero = 0;
				}
				CX = CX - BX;
			} else if ("AX".equals(s2)) {
				if (CX > AX) {
					sign = 0;
					zero = 0;
				} else if (CX == AX) {
					sign = 0;
					zero = 1;
				} else {
					sign = 1;
					zero = 0;
				}
				CX = CX - AX;
			} else if ("DX".equals(s2)) {
				if (CX > DX) {
					sign = 0;
					zero = 0;
				} else if (CX == DX) {
					sign = 0;
					zero = 1;
				} else {
					sign = 1;
					zero = 0;
				}
				CX = CX - DX;
			} else {
				int d = Integer.parseInt(s2);
				if (CX > d) {
					sign = 0;
					zero = 0;
				} else if (CX == d) {
					sign = 0;
					zero = 1;
				} else {
					sign = 1;
					zero = 0;
				}
				CX = CX - d;
			}
		} else if ("DX".equals(s1)) {
			if (s2.equals("DX")) {
				sign = 0;
				zero = 1;
				DX = DX - DX;
			} else if ("BX".equals(s2)) {
				if (DX > BX) {
					sign = 0;
					zero = 0;
				} else if (DX == BX) {
					sign = 0;
					zero = 1;
				} else {
					sign = 1;
					zero = 0;
				}
				DX = DX - BX;
			} else if ("CX".equals(s2)) {
				if (DX > CX) {
					sign = 0;
					zero = 0;
				} else if (DX == CX) {
					sign = 0;
					zero = 1;
				} else {
					sign = 1;
					zero = 0;
				}
				DX = DX - CX;
			} else if ("AX".equals(s2)) {
				if (DX > AX) {
					sign = 0;
					zero = 0;
				} else if (DX == AX) {
					sign = 0;
					zero = 1;
				} else {
					sign = 1;
					zero = 0;
				}
				DX = DX - AX;
			} else {
				int d = Integer.parseInt(s2);
				if (DX > d) {
					sign = 0;
					zero = 0;
				} else if (DX == d) {
					sign = 0;
					zero = 1;
				} else {
					sign = 1;
					zero = 0;
				}
				DX = DX - d;
			}
		}
	}

	public void CRP(String s1, String s2) {

		if ("AX".equals(s1)) {
			if ("BX".equals(s2)) {
				AX = AX * BX;
			} else if ("CX".equals(s2)) {
				AX = AX * CX;
			} else if ("DX".equals(s2)) {
				AX = AX * DX;
			} else {
				AX = AX * Integer.parseInt(s2);
			}
		} else if ("BX".equals(s1)) {
			if ("AX".equals(s2)) {
				BX = BX * AX;
			} else if ("CX".equals(s2)) {
				BX = BX * CX;
			} else if ("DX".equals(s2)) {
				BX = BX * DX;
			} else {
				BX = BX * Integer.parseInt(s2);
			}
		} else if ("CX".equals(s1)) {
			if ("BX".equals(s2)) {
				CX = CX * BX;
			} else if ("AX".equals(s2)) {
				CX = CX * AX;
			} else if ("DX".equals(s2)) {
				CX = CX * DX;
			} else {
				CX = CX * Integer.parseInt(s2);
			}
		} else if ("DX".equals(s1)) {
			if ("BX".equals(s2)) {
				DX = DX * BX;
			} else if ("CX".equals(s2)) {
				DX = DX * CX;
			} else if ("AX".equals(s2)) {
				DX = DX * AX;
			} else {
				DX = DX * Integer.parseInt(s2);
			}
		}
	}

	public void BOL(String s1, String s2) {

		if ("AX".equals(s1)) {
			if ("BX".equals(s2)) {
				AX = AX / BX;
			} else if ("CX".equals(s2)) {
				AX = AX / CX;
			} else if ("DX".equals(s2)) {
				AX = AX / DX;
			} else {
				AX = AX / Integer.parseInt(s2);
			}
		} else if ("BX".equals(s1)) {
			if ("AX".equals(s2)) {
				BX = BX / AX;
			} else if ("CX".equals(s2)) {
				BX = BX / CX;
			} else if ("DX".equals(s2)) {
				BX = BX / DX;
			} else {
				BX = BX / Integer.parseInt(s2);
			}
		} else if ("CX".equals(s1)) {
			if ("BX".equals(s2)) {
				CX = CX / BX;
			} else if ("AX".equals(s2)) {
				CX = CX / AX;
			} else if ("DX".equals(s2)) {
				CX = CX / DX;
			} else {
				CX = CX / Integer.parseInt(s2);
			}
		} else if ("DX".equals(s1)) {
			if ("BX".equals(s2)) {
				DX = DX / BX;
			} else if ("CX".equals(s2)) {
				DX = DX / CX;
			} else if ("AX".equals(s2)) {
				DX = DX / AX;
			} else {
				DX = DX / Integer.parseInt(s2);
			}
		}
	}

	public void VE(String s1, String s2) {

		if ("AX".equals(s1)) {
			if ("BX".equals(s2)) {
				AX = AX & BX;
			} else if ("CX".equals(s2)) {
				AX = AX & CX;
			} else if ("DX".equals(s2)) {
				AX = AX & DX;
			} else {
				AX = AX & Integer.parseInt(s2);
			}
		} else if ("BX".equals(s1)) {
			if ("AX".equals(s2)) {
				BX = BX & AX;
			} else if ("CX".equals(s2)) {
				BX = BX & CX;
			} else if ("DX".equals(s2)) {
				BX = BX & DX;
			} else {
				BX = BX & Integer.parseInt(s2);
			}
		} else if ("CX".equals(s1)) {
			if ("BX".equals(s2)) {
				CX = CX & BX;
			} else if ("AX".equals(s2)) {
				CX = CX & AX;
			} else if ("DX".equals(s2)) {
				CX = CX & DX;
			} else {
				CX = CX & Integer.parseInt(s2);
			}
		} else if ("DX".equals(s1)) {
			if ("BX".equals(s2)) {
				DX = DX & BX;
			} else if ("CX".equals(s2)) {
				DX = DX & CX;
			} else if ("AX".equals(s2)) {
				DX = DX & AX;
			} else {
				DX = DX & Integer.parseInt(s2);
			}
		}
	}

	public void VEY(String s1, String s2) {

		if ("AX".equals(s1)) {
			if ("BX".equals(s2)) {
				AX = AX | BX;
			} else if ("CX".equals(s2)) {
				AX = AX | CX;
			} else if ("DX".equals(s2)) {
				AX = AX | DX;
			} else {
				AX = AX | Integer.parseInt(s2);
			}
		} else if ("BX".equals(s1)) {
			if ("AX".equals(s2)) {
				BX = BX | AX;
			} else if ("CX".equals(s2)) {
				BX = BX | CX;
			} else if ("DX".equals(s2)) {
				BX = BX | DX;
			} else {
				BX = BX | Integer.parseInt(s2);
			}
		} else if ("CX".equals(s1)) {
			if ("BX".equals(s2)) {
				CX = CX | BX;
			} else if ("AX".equals(s2)) {
				CX = CX | AX;
			} else if ("DX".equals(s2)) {
				CX = CX | DX;
			} else {
				CX = CX | Integer.parseInt(s2);
			}
		} else if ("DX".equals(s1)) {
			if ("BX".equals(s2)) {
				DX = DX | BX;
			} else if ("CX".equals(s2)) {
				DX = DX | CX;
			} else if ("AX".equals(s2)) {
				DX = DX | AX;
			} else {
				DX = DX | Integer.parseInt(s2);
			}
		}
	}

	public void DEG(String s1) {

		int t = 2147483647;

		if (s1.equals("AX")) {
			AX = AX ^ t;
		} else if (s1.equals("BX")) {
			BX = BX ^ t;
		} else if (s1.equals("CX")) {
			CX = CX ^ t;
		} else if (s1.equals("DX")) {
			DX = DX ^ t;
		} else {
			int a = Integer.parseInt(s1);
			a = a ^ t;
		}

	}

	public void OKU(String s1) {

		sc = new Scanner(System.in);

		if (s1.equals("AX")) {
			System.out.print("AX için değer giriniz: ");
			AX = sc.nextInt();
		} else if (s1.equals("BX")) {
			System.out.print("BX için değer giriniz: ");
			BX = sc.nextInt();
		} else if (s1.equals("CX")) {
			System.out.print("CX için değer giriniz: ");
			CX = sc.nextInt();
		} else if (s1.equals("DX")) {
			System.out.print("DX için değer giriniz: ");
			DX = sc.nextInt();
		}
	}

}