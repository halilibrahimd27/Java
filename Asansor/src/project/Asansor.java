package project;

public class Asansor {

	private final int maxKapasite;
	private final int maxKat;
	public int mevcutKat = 0;
	public int kisiSayisi = 0;

	public Asansor(int maxKapasite, int maxKat) {
		this.maxKapasite = maxKapasite;
		this.maxKat = maxKat;
	}

	public void yolcu(int kisi, int nerede, int nereye) {
		asansorNereye(nerede);
		if (bin(kisi, nereye)) {
			asansorNereye(nereye);
			in(kisi);
		}
	}

	public void kapiAc() {
		System.out.println("\nKapı açıldı.");
	}

	public void kapiKapat() {
		System.out.println("Kapı kapatıldı.\n");
	}

	public boolean bin(int kisi, int nereye) {
		kisiSayisi += kisi;
		if (kisiSayisi > maxKapasite) {
			System.out.println("Asansör max ağırlığı aşıldı kapı kapatılamıyor...");
			System.exit(0);
			return false;
		} else if (nereye < 0 || nereye > maxKat) {
			System.out.println("Lütfen geçerli bir kat numarası giriniz.");
			System.exit(0);
			return false;
		} else {
			kapiKapat();
			asansorNereye(nereye);
			in(kisi);
			return true;
		}
	}

	public void in(int kisi) {
		kapiKapat();
		kisiSayisi -= kisi;
	}

	public void asansorNereye(int kat) {
		
		if (kat > maxKat || kat < 0) {
			System.out.println("Lütfen geçerli bir kat numarası giriniz...");
			System.exit(0);
		}else {
			
			while (mevcutKat < kat) {
				if (mevcutKat == kat) {
					System.out.println("Asansor " + mevcutKat + ". katta.");
					break;
				} else {
					System.out.println("Asansor " + (mevcutKat + 1) + ". kata çıkıyor.");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					mevcutKat++;
				}
			}

			while (mevcutKat >= kat) {

				if (mevcutKat == kat) {
					asansorNerede();
					break;
				} else {
					System.out.println("Asansor " + (mevcutKat - 1) + ". kata iniyor.");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					mevcutKat--;
				}
			}
		}
	}

	public void asansorNerede() {
		System.out.println("Asansor " + mevcutKat + ". katta.");
		kapiAc();
	}

	public int getKatSayisi() {
		return maxKat;
	}

	public int getMaxAgırlık() {
		return maxKapasite;
	}

}