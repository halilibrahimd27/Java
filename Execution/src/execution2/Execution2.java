package execution2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Execution2 {


	private static Scanner scanner;

	public static void main(String[] args) {
		Fonksiyonlar f = new Fonksiyonlar();

		scanner = new Scanner(System.in);

		try {

			System.out.print("Dosya adını ve yolunu giriniz: ");
			String dosya = scanner.nextLine();

			BufferedReader br = new BufferedReader(new FileReader(dosya));

			String[] dizi = f.tokenize(br);

			for (int a = 0; a < dizi.length; a++) {
				if (dizi[a].equals("HRK")) {
					if (dizi[a + 1].equals("AX")) {
						f.HRK(dizi[a + 1], dizi[a + 2]);
					} else if (dizi[a + 1].equals("BX")) {
						f.HRK(dizi[a + 1], dizi[a + 2]);
					} else if (dizi[a + 1].equals("CX")) {
						f.HRK(dizi[a + 1], dizi[a + 2]);
					} else if (dizi[a + 1].equals("DX")) {
						f.HRK(dizi[a + 1], dizi[a + 2]);
					}
				} else if (dizi[a].equals("TOP")) {
					if (dizi[a + 1].equals("AX")) {
						f.TOP(dizi[a + 1], dizi[a + 2]);
					} else if (dizi[a + 1].equals("BX")) {
						f.TOP(dizi[a + 1], dizi[a + 2]);
					} else if (dizi[a + 1].equals("CX")) {
						f.TOP(dizi[a + 1], dizi[a + 2]);
					} else if (dizi[a + 1].equals("DX")) {
						f.TOP(dizi[a + 1], dizi[a + 2]);
					}
				} else if (dizi[a].equals("CIK")) {
					if (dizi[a + 1].equals("AX")) {
						f.CIK(dizi[a + 1], dizi[a + 2]);
					} else if (dizi[a + 1].equals("BX")) {
						f.CIK(dizi[a + 1], dizi[a + 2]);
					} else if (dizi[a + 1].equals("CX")) {
						f.CIK(dizi[a + 1], dizi[a + 2]);
					} else if (dizi[a + 1].equals("DX")) {
						f.CIK(dizi[a + 1], dizi[a + 2]);
					}
				} else if (dizi[a].equals("CRP")) {
					if (dizi[a + 1].equals("AX")) {
						f.CRP(dizi[a + 1], dizi[a + 2]);
					} else if (dizi[a + 1].equals("BX")) {
						f.CRP(dizi[a + 1], dizi[a + 2]);
					} else if (dizi[a + 1].equals("CX")) {
						f.CRP(dizi[a + 1], dizi[a + 2]);
					} else if (dizi[a + 1].equals("DX")) {
						f.CRP(dizi[a + 1], dizi[a + 2]);
					}
				} else if (dizi[a].equals("BOL")) {
					if (dizi[a + 1].equals("AX")) {
						f.BOL(dizi[a + 1], dizi[a + 2]);
					} else if (dizi[a + 1].equals("BX")) {
						f.BOL(dizi[a + 1], dizi[a + 2]);
					} else if (dizi[a + 1].equals("CX")) {
						f.BOL(dizi[a + 1], dizi[a + 2]);
					} else if (dizi[a + 1].equals("DX")) {
						f.BOL(dizi[a + 1], dizi[a + 2]);
					}
				} else if (dizi[a].equals("VE")) {
					if (dizi[a + 1].equals("AX")) {
						f.VE(dizi[a + 1], dizi[a + 2]);
					} else if (dizi[a + 1].equals("BX")) {
						f.VE(dizi[a + 1], dizi[a + 2]);
					} else if (dizi[a + 1].equals("CX")) {
						f.VE(dizi[a + 1], dizi[a + 2]);
					} else if (dizi[a + 1].equals("DX")) {
						f.VE(dizi[a + 1], dizi[a + 2]);
					}
				} else if (dizi[a].equals("VEY")) {
					if (dizi[a + 1].equals("AX")) {
						f.VEY(dizi[a + 1], dizi[a + 2]);
					} else if (dizi[a + 1].equals("BX")) {
						f.VEY(dizi[a + 1], dizi[a + 2]);
					} else if (dizi[a + 1].equals("CX")) {
						f.VEY(dizi[a + 1], dizi[a + 2]);
					} else if (dizi[a + 1].equals("DX")) {
						f.VEY(dizi[a + 1], dizi[a + 2]);
					}
				} else if (dizi[a].equals("SON")) {
					System.exit(0);
				} else if (dizi[a].equals("DEG")) {
					if (dizi[a + 1].equals("AX")) {
						f.DEG(dizi[a + 1]);
					} else if (dizi[a + 1].equals("BX")) {
						f.DEG(dizi[a + 1]);
					} else if (dizi[a + 1].equals("CX")) {
						f.DEG(dizi[a + 1]);
					} else if (dizi[a + 1].equals("DX")) {
						f.DEG(dizi[a + 1]);
					}
				} else if (dizi[a].equals("YAZ")) {
					if (dizi[a + 1].equals("AX")) {
						f.YAZ(dizi[a + 1]);
					} else if (dizi[a + 1].equals("BX")) {
						f.YAZ(dizi[a + 1]);
					} else if (dizi[a + 1].equals("CX")) {
						f.YAZ(dizi[a + 1]);
					} else if (dizi[a + 1].equals("DX")) {
						f.YAZ(dizi[a + 1]);
					}
				} else if (dizi[a].equals("OKU")) {
					if (dizi[a + 1].equals("AX")) {
						f.OKU(dizi[a + 1]);
					} else if (dizi[a + 1].equals("BX")) {
						f.OKU(dizi[a + 1]);
					} else if (dizi[a + 1].equals("CX")) {
						f.OKU(dizi[a + 1]);
					} else if (dizi[a + 1].equals("DX")) {
						f.OKU(dizi[a + 1]);
					}
				} else if (dizi[a].equals("D")) {
					if (dizi[a + 1].equals("ETIKET1")) {
						for (int i = 0; i < dizi.length; i++) {
							if (dizi[i].equals("ETIKET1")) {
								a = i;
								break;
							}
						}
					} else if (dizi[a + 1].equals("ETIKET2")) {
						for (int i = 0; i < dizi.length; i++) {
							if (dizi[i].equals("ETIKET2")) {
								a = i;
								break;
							}
						}
					} else if (dizi[a + 1].equals("ETIKET3")) {
						for (int i = 0; i < dizi.length; i++) {
							if (dizi[i].equals("ETIKET3")) {
								a = i;
								break;
							}
						}
					} else if (dizi[a + 1].equals("ETIKET4")) {
						for (int i = 0; i < dizi.length; i++) {
							if (dizi[i].equals("ETIKET4")) {
								a = i;
								break;
							}
						}
					} else if (dizi[a + 1].equals("ETIKET5")) {
						for (int i = 0; i < dizi.length; i++) {
							if (dizi[i].equals("ETIKET5")) {
								a = i;
								break;
							}
						}
					} else if (dizi[a + 1].equals("ETIKET6")) {
						for (int i = 0; i < dizi.length; i++) {
							if (dizi[i].equals("ETIKET6")) {
								a = i;
								break;
							}
						}
					} else if (dizi[a + 1].equals("ETIKET7")) {
						for (int i = 0; i < dizi.length; i++) {
							if (dizi[i].equals("ETIKET7")) {
								a = i;
								break;
							}
						}
					} else if (dizi[a + 1].equals("ETIKET8")) {
						for (int i = 0; i < dizi.length; i++) {
							if (dizi[i].equals("ETIKET8")) {
								a = i;
								break;
							}
						}
					} else if (dizi[a + 1].equals("ETIKET9")) {
						for (int i = 0; i < dizi.length; i++) {
							if (dizi[i].equals("ETIKET9")) {
								a = i;
								break;
							}
						}
					} else if (dizi[a + 1].equals("ETIKET10")) {
						for (int i = 0; i < dizi.length; i++) {
							if (dizi[i].equals("ETIKET10")) {
								a = i;
								break;
							}
						}
					}
				} else if (dizi[a].equals("DB")) {
					if (Fonksiyonlar.sign == 0 && Fonksiyonlar.zero == 0) {
						if (dizi[a + 1].equals("ETIKET1")) {
							for (int i = 0; i < dizi.length; i++) {
								if (dizi[i].equals("ETIKET1")) {
									a = i;
									break;
								}
							}
						} else if (dizi[a + 1].equals("ETIKET2")) {
							for (int i = 0; i < dizi.length; i++) {
								if (dizi[i].equals("ETIKET2")) {
									a = i;
									break;
								}
							}
						} else if (dizi[a + 1].equals("ETIKET3")) {
							for (int i = 0; i < dizi.length; i++) {
								if (dizi[i].equals("ETIKET3")) {
									a = i;
									break;
								}
							}
						} else if (dizi[a + 1].equals("ETIKET4")) {
							for (int i = 0; i < dizi.length; i++) {
								if (dizi[i].equals("ETIKET4")) {
									a = i;
									break;
								}
							}
						} else if (dizi[a + 1].equals("ETIKET5")) {
							for (int i = 0; i < dizi.length; i++) {
								if (dizi[i].equals("ETIKET5")) {
									a = i;
									break;
								}
							}
						} else if (dizi[a + 1].equals("ETIKET6")) {
							for (int i = 0; i < dizi.length; i++) {
								if (dizi[i].equals("ETIKET6")) {
									a = i;
									break;
								}
							}
						} else if (dizi[a + 1].equals("ETIKET7")) {
							for (int i = 0; i < dizi.length; i++) {
								if (dizi[i].equals("ETIKET7")) {
									a = i;
									break;
								}
							}
						} else if (dizi[a + 1].equals("ETIKET8")) {
							for (int i = 0; i < dizi.length; i++) {
								if (dizi[i].equals("ETIKET8")) {
									a = i;
									break;
								}
							}
						} else if (dizi[a + 1].equals("ETIKET9")) {
							for (int i = 0; i < dizi.length; i++) {
								if (dizi[i].equals("ETIKET9")) {
									a = i;
									break;
								}
							}
						} else if (dizi[a + 1].equals("ETIKET10")) {
							for (int i = 0; i < dizi.length; i++) {
								if (dizi[i].equals("ETIKET10")) {
									a = i;
									break;
								}
							}
						}
					}
				} else if (dizi[a].equals("DK")) {
					if (Fonksiyonlar.sign == 1 && Fonksiyonlar.zero == 0) {
						if (dizi[a + 1].equals("ETIKET1")) {
							for (int i = 0; i < dizi.length; i++) {
								if (dizi[i].equals("ETIKET1")) {
									a = i;
									break;
								}
							}
						} else if (dizi[a + 1].equals("ETIKET2")) {
							for (int i = 0; i < dizi.length; i++) {
								if (dizi[i].equals("ETIKET2")) {
									a = i;
									break;
								}
							}
						} else if (dizi[a + 1].equals("ETIKET3")) {
							for (int i = 0; i < dizi.length; i++) {
								if (dizi[i].equals("ETIKET3")) {
									a = i;
									break;
								}
							}
						} else if (dizi[a + 1].equals("ETIKET4")) {
							for (int i = 0; i < dizi.length; i++) {
								if (dizi[i].equals("ETIKET4")) {
									a = i;
									break;
								}
							}
						} else if (dizi[a + 1].equals("ETIKET5")) {
							for (int i = 0; i < dizi.length; i++) {
								if (dizi[i].equals("ETIKET5")) {
									a = i;
									break;
								}
							}
						} else if (dizi[a + 1].equals("ETIKET6")) {
							for (int i = 0; i < dizi.length; i++) {
								if (dizi[i].equals("ETIKET6")) {
									a = i;
									break;
								}
							}
						} else if (dizi[a + 1].equals("ETIKET7")) {
							for (int i = 0; i < dizi.length; i++) {
								if (dizi[i].equals("ETIKET7")) {
									a = i;
									break;
								}
							}
						} else if (dizi[a + 1].equals("ETIKET8")) {
							for (int i = 0; i < dizi.length; i++) {
								if (dizi[i].equals("ETIKET8")) {
									a = i;
									break;
								}
							}
						} else if (dizi[a + 1].equals("ETIKET9")) {
							for (int i = 0; i < dizi.length; i++) {
								if (dizi[i].equals("ETIKET9")) {
									a = i;
									break;
								}
							}
						} else if (dizi[a + 1].equals("ETIKET10")) {
							for (int i = 0; i < dizi.length; i++) {
								if (dizi[i].equals("ETIKET10")) {
									a = i;
									break;
								}
							}
						}
					}
				} else if (dizi[a].equals("DE")) {
					if (Fonksiyonlar.sign == 0 && Fonksiyonlar.zero == 1) {
						if (dizi[a + 1].equals("ETIKET1")) {
							for (int i = 0; i < dizi.length; i++) {
								if (dizi[i].equals("ETIKET1")) {
									a = i;
									break;
								}
							}
						} else if (dizi[a + 1].equals("ETIKET2")) {
							for (int i = 0; i < dizi.length; i++) {
								if (dizi[i].equals("ETIKET2")) {
									a = i;
									break;
								}
							}
						} else if (dizi[a + 1].equals("ETIKET3")) {
							for (int i = 0; i < dizi.length; i++) {
								if (dizi[i].equals("ETIKET3")) {
									a = i;
									break;
								}
							}
						} else if (dizi[a + 1].equals("ETIKET4")) {
							for (int i = 0; i < dizi.length; i++) {
								if (dizi[i].equals("ETIKET4")) {
									a = i;
									break;
								}
							}
						} else if (dizi[a + 1].equals("ETIKET5")) {
							for (int i = 0; i < dizi.length; i++) {
								if (dizi[i].equals("ETIKET5")) {
									a = i;
									break;
								}
							}
						} else if (dizi[a + 1].equals("ETIKET6")) {
							for (int i = 0; i < dizi.length; i++) {
								if (dizi[i].equals("ETIKET6")) {
									a = i;
									break;
								}
							}
						} else if (dizi[a + 1].equals("ETIKET7")) {
							for (int i = 0; i < dizi.length; i++) {
								if (dizi[i].equals("ETIKET7")) {
									a = i;
									break;
								}
							}
						} else if (dizi[a + 1].equals("ETIKET8")) {
							for (int i = 0; i < dizi.length; i++) {
								if (dizi[i].equals("ETIKET8")) {
									a = i;
									break;
								}
							}
						} else if (dizi[a + 1].equals("ETIKET9")) {
							for (int i = 0; i < dizi.length; i++) {
								if (dizi[i].equals("ETIKET9")) {
									a = i;
									break;
								}
							}
						} else if (dizi[a + 1].equals("ETIKET10")) {
							for (int i = 0; i < dizi.length; i++) {
								if (dizi[i].equals("ETIKET10")) {
									a = i;
									break;
								}
							}
						}
					}
				} else if (dizi[a].equals("DKE")) {
					if ((Fonksiyonlar.sign == 1 && Fonksiyonlar.zero == 0)
							|| (Fonksiyonlar.sign == 0 && Fonksiyonlar.zero == 1)) {
						if (dizi[a + 1].equals("ETIKET1")) {
							for (int i = 0; i < dizi.length; i++) {
								if (dizi[i].equals("ETIKET1")) {
									a = i;
									break;
								}
							}
						} else if (dizi[a + 1].equals("ETIKET2")) {
							for (int i = 0; i < dizi.length; i++) {
								if (dizi[i].equals("ETIKET2")) {
									a = i;
									break;
								}
							}
						} else if (dizi[a + 1].equals("ETIKET3")) {
							for (int i = 0; i < dizi.length; i++) {
								if (dizi[i].equals("ETIKET3")) {
									a = i;
									break;
								}
							}
						} else if (dizi[a + 1].equals("ETIKET4")) {
							for (int i = 0; i < dizi.length; i++) {
								if (dizi[i].equals("ETIKET4")) {
									a = i;
									break;
								}
							}
						} else if (dizi[a + 1].equals("ETIKET5")) {
							for (int i = 0; i < dizi.length; i++) {
								if (dizi[i].equals("ETIKET5")) {
									a = i;
									break;
								}
							}
						} else if (dizi[a + 1].equals("ETIKET6")) {
							for (int i = 0; i < dizi.length; i++) {
								if (dizi[i].equals("ETIKET6")) {
									a = i;
									break;
								}
							}
						} else if (dizi[a + 1].equals("ETIKET7")) {
							for (int i = 0; i < dizi.length; i++) {
								if (dizi[i].equals("ETIKET7")) {
									a = i;
									break;
								}
							}
						} else if (dizi[a + 1].equals("ETIKET8")) {
							for (int i = 0; i < dizi.length; i++) {
								if (dizi[i].equals("ETIKET8")) {
									a = i;
									break;
								}
							}
						} else if (dizi[a + 1].equals("ETIKET9")) {
							for (int i = 0; i < dizi.length; i++) {
								if (dizi[i].equals("ETIKET9")) {
									a = i;
									break;
								}
							}
						} else if (dizi[a + 1].equals("ETIKET10")) {
							for (int i = 0; i < dizi.length; i++) {
								if (dizi[i].equals("ETIKET10")) {
									a = i;
									break;
								}
							}
						}
					}
				} else if (dizi[a].equals("DBE")) {
					if ((Fonksiyonlar.sign == 0 && Fonksiyonlar.zero == 1)
							|| (Fonksiyonlar.sign == 0 && Fonksiyonlar.zero == 0)) {
						if (dizi[a + 1].equals("ETIKET1")) {
							for (int i = 0; i < dizi.length; i++) {
								if (dizi[i].equals("ETIKET1")) {
									a = i;
									break;
								}
							}
						} else if (dizi[a + 1].equals("ETIKET2")) {
							for (int i = 0; i < dizi.length; i++) {
								if (dizi[i].equals("ETIKET2")) {
									a = i;
									break;
								}
							}
					 	} else if (dizi[a + 1].equals("ETIKET3")) {
							for (int i = 0; i < dizi.length; i++) {
								if (dizi[i].equals("ETIKET3")) {
									a = i;
									break;
								}
							}
						} else if (dizi[a + 1].equals("ETIKET4")) {
							for (int i = 0; i < dizi.length; i++) {
								if (dizi[i].equals("ETIKET4")) {
									a = i;
									break;
								}
							}
						} else if (dizi[a + 1].equals("ETIKET5")) {
							for (int i = 0; i < dizi.length; i++) {
								if (dizi[i].equals("ETIKET5")) {
									a = i;
									break;
								}
							}
						} else if (dizi[a + 1].equals("ETIKET6")) {
							for (int i = 0; i < dizi.length; i++) {
								if (dizi[i].equals("ETIKET6")) {
									a = i;
									break;
								}
							}
						} else if (dizi[a + 1].equals("ETIKET7")) {
							for (int i = 0; i < dizi.length; i++) {
								if (dizi[i].equals("ETIKET7")) {
									a = i;
									break;
								}
							}
						} else if (dizi[a + 1].equals("ETIKET8")) {
							for (int i = 0; i < dizi.length; i++) {
								if (dizi[i].equals("ETIKET8")) {
									a = i;
									break;
								}
							}
						} else if (dizi[a + 1].equals("ETIKET9")) {
							for (int i = 0; i < dizi.length; i++) {
								if (dizi[i].equals("ETIKET9")) {
									a = i;
									break;
								}
							}
						} else if (dizi[a + 1].equals("ETIKET10")) {
							for (int i = 0; i < dizi.length; i++) {
								if (dizi[i].equals("ETIKET10")) {
									a = i;
									break;
								}
							}
						}
					}
				} else if (dizi[a].equals("DED")) {
					if (Fonksiyonlar.sign == 0 && Fonksiyonlar.zero == 0
							|| Fonksiyonlar.sign == 1 && Fonksiyonlar.zero == 0) {
						if (dizi[a + 1].equals("ETIKET1")) {
							for (int i = 0; i < dizi.length; i++) {
								if (dizi[i].equals("ETIKET1")) {
									a = i;
									break;
								}
							}
						} else if (dizi[a + 1].equals("ETIKET2")) {
							for (int i = 0; i < dizi.length; i++) {
								if (dizi[i].equals("ETIKET2")) {
									a = i;
									break;
								}
							}
						} else if (dizi[a + 1].equals("ETIKET3")) {
							for (int i = 0; i < dizi.length; i++) {
								if (dizi[i].equals("ETIKET3")) {
									a = i;
									break;
								}
							}
						} else if (dizi[a + 1].equals("ETIKET4")) {
							for (int i = 0; i < dizi.length; i++) {
								if (dizi[i].equals("ETIKET4")) {
									a = i;
									break;
								}
							}
						} else if (dizi[a + 1].equals("ETIKET5")) {
							for (int i = 0; i < dizi.length; i++) {
								if (dizi[i].equals("ETIKET5")) {
									a = i;
									break;
								}
							}
						} else if (dizi[a + 1].equals("ETIKET6")) {
							for (int i = 0; i < dizi.length; i++) {
								if (dizi[i].equals("ETIKET6")) {
									a = i;
									break;
								}
							}
						} else if (dizi[a + 1].equals("ETIKET7")) {
							for (int i = 0; i < dizi.length; i++) {
								if (dizi[i].equals("ETIKET7")) {
									a = i;
									break;
								}
							}
						} else if (dizi[a + 1].equals("ETIKET8")) {
							for (int i = 0; i < dizi.length; i++) {
								if (dizi[i].equals("ETIKET8")) {
									a = i;
									break;
								}
							}
						} else if (dizi[a + 1].equals("ETIKET9")) {
							for (int i = 0; i < dizi.length; i++) {
								if (dizi[i].equals("ETIKET9")) {
									a = i;
									break;
								}
							}
						} else if (dizi[a + 1].equals("ETIKET10")) {
							for (int i = 0; i < dizi.length; i++) {
								if (dizi[i].equals("ETIKET10")) {
									a = i;
									break;
								}
							}
						}
					}
				}
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
