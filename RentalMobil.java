import java.io.*;
import java.util.*;
import java.lang.String;

public class RentalMobil
{
	public static void main(String[] args)
	{
		Scanner diinput = new Scanner(System.in);
		BufferedReader nginput = new BufferedReader(new InputStreamReader(System.in));
		int i, pilih, hargasewa, lamasewa, totalbayar, konfirmasi;
		boolean berhenti=false;
		String nama, namamobil, kodemobil;
		avanza jalankan = new avanza();
		try
		{
			do
			{
				for(i = 0; i<500; i++)
				{
					System.out.println();
				}
				System.out.print(" ========================================================================\n");
				System.out.print("                    ========RENTAL MOBIL========\n");
				System.out.print(" ========================================================================\n");
				System.out.print(" DAFTAR MOBIL :\n");
				System.out.print(" ========================================================================\n\n");
				System.out.print("No | Nama Mobil | KODE MOBIL| Harga sewa/Hari |\n");
				System.out.print("1. | Avanza     | AV(1-5)   | Rp.300.000,-    | \n");
				System.out.print("2. | Xenia      | XN(1-4)   | Rp.250000 ,-    | \n");
				System.out.print("3. | Pregio     | PG(1-3)   | Rp.700000 ,-    | \n");
				System.out.print("4. | Honda Jazz | JZ(1-2)   | Rp.900000 ,-    | \n");
				System.out.print("5. | Lamborghini| LG1       | Rp.5000000 ,-   | \n\n");
				System.out.print(" ========================================================================\n\n");
				System.out.print("Nama Peminjam : ");
				nama = nginput.readLine();
				System.out.print("Lama Meminjam (hari): ");
				lamasewa = diinput.nextInt();
				System.out.print("Masukkan Pilihan Sewa : ");
				pilih = diinput.nextInt();
				switch(pilih)
				{
					case 1:
							do
							{
								System.out.print("Masukkan kode mobil dengan benar : ");
								kodemobil = nginput.readLine();
							}
							while(!(jalankan.proses(kodemobil)).equals(kodemobil));
							kodemobil = jalankan.proses(kodemobil);
							namamobil = "Avanza";
							hargasewa = 300000;
							break;
					
					default :
								namamobil = "-";
								kodemobil = "-";
								kodemobil = jalankan.proses(kodemobil);
								hargasewa = 0;
								break;
				}
				totalbayar = hargasewa*lamasewa;
				for(i=0;i<500;i++)
				{
					System.out.println();
				}
				System.out.println("Nama Peminjam : "+nama);
				System.out.println("Nama Mobil : "+namamobil);
				System.out.println("Kode Mobil : "+kodemobil);
				System.out.println("Harga Sewa/Hari : "+hargasewa);
				System.out.println("Lama Sewa : "+lamasewa);
				System.out.println("Total Pembayaran : "+totalbayar);
				System.out.println();
				System.out.println("Apakah ada yang akan menyewa mobil lagi?");
				System.out.println("1. Ya");
				System.out.println("2. Tidak");
				System.out.print("Pilih (1/2) : ");
				konfirmasi = diinput.nextInt();
				if(konfirmasi==2)
				{
					berhenti = true;
				}			
			}
			while(!berhenti);
		}
		catch(Exception e)
		{
			System.out.println();
		}
	}
}

class avanza
{
	stackavanza intruksi = new stackavanza();
	
	String proses(String kode)
	{
		boolean cek = intruksi.cekavanza();
		boolean cari = intruksi.cariavanza(kode);
		if(cek)
		{
			if(cari)
			{
				intruksi.keluarkan(kode);
			}
			else
			{
				System.out.println();
				System.out.println("Kode Mobil Salah!");
				System.out.println();
			}
		}
		else
		{
			System.out.println();
			System.out.println("Stock Mobil Kosong!");
			System.out.println();
		}
	}
}

class stackavanza
{
	int topavanza = 4;
	String[] kodemobil = {"AV1", "AV2", "AV3", "AV4", "AV5"};
	int index;
		
	boolean cekavanza()
	{
		if(topavanza > -1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	boolean cariavanza(String kode)
	{
		for(int i = topavanza; i>=0; i--)
		{
			if(kode.equals(kodemobil[i]))
			{
				index = i;
				return true;
			}
			else
			{
				return false;
			}
		}
	}
	
	String keluarkan(String kode)
	{
		String avanzakeluar;
		avanzakeluar = kodemobil[index];
		for(int i = index; i<=topavanza; i++)
		{
			kodemobil[i] = kodemobil[i+1];
		}
		topavanza--;
		return avanzakeluar;
	 }
}
	