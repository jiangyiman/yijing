package org.boc.db.qm;


public class QimenGeju3 {
//	private DaoQiMen daoqm;
//	private QimenPublic pub; 
//	private String[] liunian ; //�������˹����е��������
//	int index = 0; //��������ΪdescMY����
//	
//	//���ߡ�����һ���ߡ��м�һ���ߡ���һ���ߡ�Ҫ�ظ����ɼ��Ŀհ��ַ�
//	private final String FILL1 = "��";   //ռ�����ַ�
//	private final String FILL2 = " ";   //ռһ���ַ�������΢��
//	private final String BORDER  =  "��";  // �� ���� ����������  ��  ��  ������  �ȩ� ��
//	
//	private final String UPLINE   = "���������������������������������Щ������������������������������Щ�������������������������������";
//	private final String MIDLINE =  "���������������������������������੬�����������������������������੬������������������������������";
//	private final String DOWNLINE = "���������������������������������ة������������������������������ة�������������������������������";
////	private final String UPLINEOUT   = "���������������������������������ש������������������������������ש�������������������������������";
////	private final String MIDLINEOUT =  "�ǩ������������������������������贈�����������������������������贈������������������������������";
////	private final String DOWNLINEOUT = "���������������������������������ߩ������������������������������ߩ�������������������������������";	
//	private final int SMALL = 12;  //С������ 
//	private final int BIG = 21;    //�������
//	private final int COL = 15;  //һ���Ź��������
//	
//	//��Щ������������������ַ��ĸ�����
//	private final int[] LINE4 = {2,2,4,2,3};  
//	private final int[] LINE5 = {0,0,0,0,4,3};
//	//private final int[] LINE6 = LINE5; //{2,2,4,3};
//	private final int[] LINE7 = {1,3,3,7,1};
//	
//	//�岻��ʱ���츨��ʱ�����ŷ��ʡ����Ƿ��ʡ����ŷ��������Ƿ���	
//	/**
//	 * �������С��1��2��3�в��õ���4��5��6��7Ҫ��
//	 * ��1����2����1�����ģ�����9�񡱩�    ����һ�µģ�����ӡ��������з��
//	 * ÿ���7�У� ÿ�������̶���
//	 * 1�У�����˥smallpink-1��������ʱsmallblue-2��smallblack-16
//	 * 2�У���Ҫ���׸�smallblack-19
//	 * 3�У��ո�smallblack-19
//	 * 4�У��ո�smallblack-3,����bigblack(bigred)-1���ո�smallblack-4������̳����smallblack-10
//	 * 5�У����Ź�����˥smallblack-3������bigblack(bigred)-1�����ǹ�����˥smallblack-4������bigblack-2���ͳ����Ĺsmallblack-6
//	 * 6�У����ǹ�����˥smallblack-3������bigblack-1�����ǹ�����˥smallblack-4������bigblack-2���ͳ����Ĺsmallblack-6
//	 * 7�У��ո�smallblack-4�����̰���smallblack(smallred)-1���ո�smallblack-5������smallblack-9
//	 */
//	public String getGeju(ResultPanel rp, StringBuffer str) {
//		this.resultPane = rp;  	
//		try {
//			init();
//			
//			sblack(UPLINE);
//			newLine();
//			
//			for(int i=1; i<=7; i++) {
//				pGong(4, i);
//				pGong(9, i);
//				pGong(2, i);
//				sblack(BORDER);
//				newLine();
//			}
//			
//			sblack(MIDLINE);
//			newLine();
//			
//			for(int i=1; i<=7; i++) {
//				pGong(3, i);
//				pGong(5, i);
//				pGong(7, i);
//				sblack(BORDER);
//				newLine();
//			}
//			
//			sblack(MIDLINE);
//			newLine();
//			
//			for(int i=1; i<=7; i++) {
//				pGong(8, i);
//				pGong(1, i);
//				pGong(6, i);
//				sblack(BORDER);
//				newLine();
//			}
//			
//			sblack(DOWNLINE);
//			newLine();
//		} catch (BadLocationException e) {
//			e.printStackTrace();
//			return null;
//		}
//		
//		return null;
//	}
//	
//	/**
//	 * ����Ź���
//	 * @param gong
//	 * @throws BadLocationException
//	 */
//	private void pGong(int gong, int line) throws BadLocationException{		
//		sblack(BORDER);
//		if(line==1) pLine1(gong);
//		else if(line==2) pLine2(gong);
//		else if(line==3) pLine3(gong);
//		else if(line==4) pLine4(gong);
//		else if(line==5) pLine5(gong);
//		else if(line==6) pLine6(gong);
//		else if(line==7) pLine7(gong);		
//	}
//	
//	/**
//	 * �����һ�У�����˥smallpink��������ʱsmallblue��smallblack
//	 */
//	private void pLine1(int gong) throws BadLocationException{	
//		int len = COL; 
//		if(gong==5) {
//			swhite(speat(len,FILL1));
//			return;
//		}
//		
//		//1. ������˥		
//		String gongWS = QiMen.gong_yue[gong][SiZhu.yz];
//		spink(gongWS);
//		len--;
//		
//		//2. ������ʱ��־
////		String nyrs = "";
////		int[] gans = pub.getTpjy(gong);		
////		if(gans[0]==ng || gans[1]==ng) {nyrs+="����"; len=len-2;}
////		if(gans[0]==yg || gans[1]==yg) {nyrs+="����"; len=len-2;}
////		if(gans[0]==rg || gans[1]==rg) {nyrs+="����"; len=len-2;}
////		if(gans[0]==sg || gans[1]==sg) {nyrs+="��ʱ"; len=len-2;}
////		if(nyrs.length()>0) sblue(nyrs);
//		
//		//3. �Ƿ���������ʱ��
//		if(pub.isYima(gong)) {sblack("����"); len=len-2;}
//		if(pub.isYimaOfRi(gong)) {sblack("���R"); len=len-2;}
//		
//		//4. �Ƿ����տա�ʱ��
//		if(pub.isKong(gong, pub.SHIKONGWANG)) {sblack("����"); len=len-2;}
//		if(pub.isKong(gong, pub.RIKONGWANG)) {sblack("���i"); len=len-2;}
//		
//		//5. ʣ�ಹ�ո�
//		swhite(speat(len,FILL1));
//	}
//	/**
//	 * ����ڶ��У���Ҫ���׸�smallblack-19
//	 */
//	private void pLine2(int gong) throws BadLocationException{
//		int len = COL;
//		StringBuilder sb  = new StringBuilder();
//		if(gong==5) {
//			swhite(speat(len,FILL1));
//			return;
//		}		
//		
//		//1. �Ƿ�������ʱ�񡢷ɸɷ���
//		String ge = "";
//		int[] tgan = pub.getTpjy(gong);
//		int[] dgan = pub.getDpjy(gong);
//		if((tgan[0]==YiJing.GENG || tgan[1]==YiJing.GENG) && (dgan[0]==ng || dgan[1]==ng)) {
//			len-=3; ge += "�����";
//		}
//		if((tgan[0]==YiJing.GENG || tgan[1]==YiJing.GENG) && (dgan[0]==yg || dgan[1]==yg)) {
//			len-=3; ge += "���¸�";
//		}
//		if((tgan[0]==YiJing.GENG || tgan[1]==YiJing.GENG) && (dgan[0]==rg || dgan[1]==rg)) {
//			len-=6; ge += "���ո񡢷���";
//		}
//		if((tgan[0]==rg || tgan[1]==rg) && (dgan[0]==YiJing.GENG || dgan[1]==YiJing.GENG)) {
//			len-=3; ge += "���ɸ�";
//		}
//		if((tgan[0]==YiJing.GENG || tgan[1]==YiJing.GENG) && (dgan[0]==sg || dgan[1]==sg)) {
//			len-=3; ge += "��ʱ��";
//		}
//		sb.append(ge);
//		
//		//2. �ɹ�������
//		ge = "";
//		if((tgan[0]==YiJing.GENG || tgan[1]==YiJing.GENG) && (dgan[0]==YiJing.WUG || dgan[1]==YiJing.WUG)) {
//			len-=3; ge += "������";
//		}
//		else if((tgan[0]==YiJing.WUG || tgan[1]==YiJing.WUG) && (dgan[0]==YiJing.GENG || dgan[1]==YiJing.GENG)) {
//			len-=3; ge += "���ɹ�";
//		}
//		sb.append(ge);
//		
//		//3. 㣸� ��+�����+�����+������ʱ
//		ge="";
//		if((tgan[0]==YiJing.WUG || tgan[1]==YiJing.WUG) && (dgan[0]==YiJing.BING || dgan[1]==YiJing.BING)) {
//			len-=3; ge += "��㣸�";
//		}
//		else if((tgan[0]==YiJing.BING || tgan[1]==YiJing.BING) && 
//				(dgan[0]==YiJing.WUG || dgan[1]==YiJing.WUG || dgan[1]==ng ||dgan[1]==yg ||dgan[1]==rg ||dgan[1]==sg)) {
//			len-=3; ge += "��㣸�";
//		}
//		sb.append(ge);
//		
//		//4. �������ţ������������ʱ�� �������ڱΣ��������ɣ�����ʱ�ɡ�
//		ge = "";
//		if((tgan[0]==YiJing.GUI || tgan[1]==YiJing.GUI) && (dgan[0]==sg || dgan[1]==sg)) {
//			len-=3; ge += "������";
//		}
//		else if((tgan[0]==YiJing.REN || tgan[1]==YiJing.REN) && (dgan[0]==sg || dgan[1]==sg)) {
//			len-=3; ge += "���ر�";
//		}
//		sb.append(ge);
//		
//		//5. ֱ������Ϊ�����̼��ӣ����̼��磻���̼��������̼׳������̼��꣬���̼��������ֻ��������������޷���
//		boolean iszhifan = ((tgan[0]==YiJing.WUG || tgan[1]==YiJing.WUG) && (dgan[0]==YiJing.XIN || dgan[1]==YiJing.XIN)) ||
//			((tgan[0]==YiJing.XIN || tgan[1]==YiJing.XIN) && (dgan[0]==YiJing.WUG || dgan[1]==YiJing.WUG)) ||
//			((tgan[0]==YiJing.JI || tgan[1]==YiJing.JI) && (dgan[0]==YiJing.REN || dgan[1]==YiJing.REN)) ||
//			((tgan[0]==YiJing.WUG || tgan[1]==YiJing.WUG) && (dgan[0]==YiJing.XIN || dgan[1]==YiJing.XIN)) ||
//			((tgan[0]==YiJing.REN || tgan[1]==YiJing.REN) && (dgan[0]==YiJing.JI || dgan[1]==YiJing.JI)) ||
//			((tgan[0]==YiJing.XIN || tgan[1]==YiJing.XIN) && (dgan[0]==YiJing.WUG || dgan[1]==YiJing.WUG));
//		if(iszhifan) {
//			sb.append("��ֵ��");
//			len-=3;
//		}
//		
//		//6. �����ʹ������������ٵ��̼�������磻���̱�����ٵ��̼��ӻ���ꣻ���̶�����ٵ��̼׳������
//		boolean is3 = (tgan[0]==YiJing.YI || tgan[1]==YiJing.YI) && (dgan[0]==YiJing.JI || dgan[1]==YiJing.JI || dgan[0]==YiJing.XIN || dgan[1]==YiJing.XIN);
//		is3 = is3 || ((tgan[0]==YiJing.BING || tgan[1]==YiJing.BING) && (dgan[0]==YiJing.WUG || dgan[1]==YiJing.WUG || dgan[0]==YiJing.GENG || dgan[1]==YiJing.GENG));
//		is3 = is3 || ((tgan[0]==YiJing.DING || tgan[1]==YiJing.DING) && (dgan[0]==YiJing.REN || dgan[1]==YiJing.REN || dgan[0]==YiJing.GUI || dgan[1]==YiJing.GUI));
//		if(is3) {
//			sb.append("����ʹ");
//			len-=3;
//		}
//		
//		//7. ��Ů���ţ�����ֱʹ���ٵ��̶���
//		if(zhishigong==gong && (dgan[0]==YiJing.DING || dgan[1]==YiJing.DING)) {
//			sb.append("������");
//			len-=3;
//		}
//		
//		//8. ������ ����������ֵ��֮��Ϊ����
//		if(gong==zhifugong && (tgan[0]==YiJing.YI || tgan[1]==YiJing.YI || dgan[0]==YiJing.YI || dgan[1]==YiJing.YI ||
//				tgan[0]==YiJing.BING || tgan[1]==YiJing.BING || dgan[0]==YiJing.BING || dgan[1]==YiJing.BING ||
//				tgan[0]==YiJing.DING || tgan[1]==YiJing.DING || dgan[0]==YiJing.DING || dgan[1]==YiJing.DING)) {
//			sb.append("������");
//			len-=3;
//		}
//		
//		int kaimen = pub.getMenGong(QiMen.MENKAI);
//		int xiumen = pub.getMenGong(QiMen.MENXIU);
//		int shmen = pub.getMenGong(QiMen.MENSHENG);
//		int jing3 = pub.getMenGong(QiMen.MENJING3);
//		int du = pub.getMenGong(QiMen.MENDU);
//		int jing1 = pub.getMenGong(QiMen.MENJING1);
//		int shang = pub.getMenGong(QiMen.MENSHANG);
//		int si = pub.getMenGong(QiMen.MENSI);
//		int shenyin = pub.getShenGong(QiMen.SHENYIN);
//		int shenhe = pub.getShenGong(QiMen.SHENHE);
//		int shendi = pub.getShenGong(QiMen.SHENDI);
//		int shentian = pub.getShenGong(QiMen.SHENTIAN);
//		boolean isyi = tgan[0]==YiJing.YI ||tgan[1]==YiJing.YI ||dgan[0]==YiJing.YI ||dgan[1]==YiJing.YI; 
//		boolean isbing = tgan[0]==YiJing.BING ||tgan[1]==YiJing.BING ||dgan[0]==YiJing.BING ||dgan[1]==YiJing.BING;
//		boolean isding = tgan[0]==YiJing.DING ||tgan[1]==YiJing.DING ||dgan[0]==YiJing.DING ||dgan[1]==YiJing.DING;
//		boolean isren = tgan[0]==YiJing.REN ||tgan[1]==YiJing.REN ||dgan[0]==YiJing.REN ||dgan[1]==YiJing.REN;
//		boolean isji = tgan[0]==YiJing.JI ||tgan[1]==YiJing.JI ||dgan[0]==YiJing.JI ||dgan[1]==YiJing.JI;
//		boolean isgui = tgan[0]==YiJing.GUI ||tgan[1]==YiJing.GUI ||dgan[0]==YiJing.GUI ||dgan[1]==YiJing.GUI;
//		//9. ��թ
//		if((kaimen==gong || xiumen==gong || shmen==gong) && (isyi || isbing || isding) && (shenyin==gong)) {
//			sb.append("����թ");len-=3;
//		}
//		if((kaimen==gong || xiumen==gong || shmen==gong) && (isyi || isbing || isding) && (shenhe==gong)) {
//			sb.append("����թ");len-=3;
//		}
//		if((kaimen==gong || xiumen==gong || shmen==gong) && (isyi || isbing || isding) && (shendi==gong)) {
//			sb.append("����թ");len-=3;
//		}
//		
//		//10. ���
//		if(jing3==gong && (isyi || isbing || isding) && shentian==gong) {
//			sb.append("�����");len-=3;
//		}
//		if(du==gong && (isgui || isji || isding) && (shenyin==gong || shendi==gong || shenhe==gong)) {
//			sb.append("���ؼ�");len-=3;
//		}
//		if(jing1==gong && isren && shentian==gong) {
//			sb.append("���˼�");len-=3;
//		}
//		if(shang==gong && (isgui || isji || isding) && (shendi==gong || shenhe==gong)) {
//			sb.append("�����");len-=3;
//		}
//		if(si==gong && (isgui || isji || isding) && shendi==gong ) {
//			sb.append("������");len-=3;
//		}
//		
//		//11. �Ŷ�
//		if((tgan[0]==YiJing.DING ||tgan[1]==YiJing.DING) && xiumen==gong && shenyin==gong) {
//			sb.append("���˶�");len-=3;
//		}
//		if((tgan[0]==YiJing.BING ||tgan[1]==YiJing.BING) && shmen==gong && shentian==gong) {
//			sb.append("�����");len-=3;
//		}
//		if((tgan[0]==YiJing.DING ||tgan[1]==YiJing.DING) && du==gong && shendi==gong) {
//			sb.append("������");len-=3;
//		}
//		if((tgan[0]==YiJing.BING ||tgan[1]==YiJing.BING) && shmen==gong && (dgan[0]==YiJing.DING ||dgan[1]==YiJing.DING)) {
//			sb.append("�����");len-=3;
//		}
//		if((tgan[0]==YiJing.YI ||tgan[1]==YiJing.YI) && kaimen==gong && (dgan[0]==YiJing.JI ||dgan[1]==YiJing.JI)) {
//			sb.append("���ض�");len-=3;
//		}
//		if((tgan[0]==YiJing.YI ||tgan[1]==YiJing.YI) && (kaimen==gong || xiumen==gong || shmen==gong) && (dgan[0]==YiJing.XIN ||dgan[1]==YiJing.XIN)) {
//			sb.append("���ƶ�");len-=3;
//		}
//		if((tgan[0]==YiJing.YI ||tgan[1]==YiJing.YI) && (kaimen==gong || xiumen==gong || shmen==gong) && (dgan[0]==YiJing.GUI ||dgan[1]==YiJing.GUI || gong==1)) {
//			sb.append("������");len-=3;
//		}
//		if((tgan[0]==YiJing.YI ||tgan[1]==YiJing.YI) && (kaimen==gong || xiumen==gong || shmen==gong) && gong==4) {
//			sb.append("�����");len-=3;
//		}
//		if((tgan[0]==YiJing.YI ||tgan[1]==YiJing.YI) && xiumen==gong && (dgan[0]==YiJing.XIN ||dgan[1]==YiJing.XIN || gong==8)) {
//			sb.append("������");len-=3;
//		}		
//
//		//12. ������������������ң�����������
//		if((tgan[0]==YiJing.GENG ||tgan[1]==YiJing.GENG) && (
//				dgan[0]==YiJing.YI ||dgan[1]==YiJing.YI || 
//				dgan[0]==YiJing.BING ||dgan[1]==YiJing.BING ||
//				dgan[0]==YiJing.DING ||dgan[1]==YiJing.DING)){
//			sb.append("�����");len-=3;
//		}
//			
//		//9. �ݼ׿������׼ӻ�����
//		if(QiMen.gan_xing[tgan[0]][gong]!=0 || QiMen.gan_xing[tgan[1]][gong]!=0) {
//			sb.append("���ݿ�");len-=3;
//		}
//		
//		if(sb.length()>0) {
//			sblack(sb.delete(0, 1).toString());
//			len++;
//		}
//		swhite(speat(len,FILL1));
//	}
//	/**
//	 * ��������У��ո�smallblack-19
//	 */
//	private void pLine3(int gong) throws BadLocationException{
//		if(gong==5) {
//			swhite(speat(COL,FILL1));
//			return;
//		}
//		StringBuilder sb = new StringBuilder();
//		int[] t = pub.getTpjy(gong);
//		int[] d = pub.getDpjy(gong);
//		
//		//1. ���ʮ�ɿ�Ӧ
//		Integer[] ge = pub.getJixiongge2(gong,0);
//		for(Integer g : ge) {
//			sb.append(QiMen.gGejuDesc[g][0]+"��");			
//		}
//		
//		//2. ������Ĺ������������
//		
//		//3. �������̣��ֽ��������ƣ�
//		if(((t[0]==YiJing.BING || t[1]==YiJing.BING || d[0]==YiJing.BING || d[1]==YiJing.BING ||
//				t[0]==YiJing.DING || t[1]==YiJing.DING || d[0]==YiJing.DING || d[1]==YiJing.DING ) && gong==1 ) ||
//				((t[0]==YiJing.BING || t[1]==YiJing.BING || t[0]==YiJing.DING || t[1]==YiJing.DING) && 
//				 (d[0]==YiJing.REN || d[1]==YiJing.REN || d[0]==YiJing.GUI || d[1]==YiJing.GUI)) ||
//				 ((d[0]==YiJing.BING || d[1]==YiJing.BING || d[0]==YiJing.DING || d[1]==YiJing.DING) && 
//						 (t[0]==YiJing.REN || t[1]==YiJing.REN || t[0]==YiJing.GUI || t[1]==YiJing.GUI)) ||
//						 ((t[0]==YiJing.YI || t[1]==YiJing.YI || d[0]==YiJing.YI || d[1]==YiJing.YI) && gong==6) ||
//						 ((t[0]==YiJing.YI || t[1]==YiJing.YI) && (d[0]==YiJing.GENG || d[1]==YiJing.GENG || d[0]==YiJing.XIN || d[1]==YiJing.XIN)) ||
//						 ((d[0]==YiJing.YI || d[1]==YiJing.YI) && (t[0]==YiJing.GENG || t[1]==YiJing.GENG || t[0]==YiJing.XIN || t[1]==YiJing.XIN)))
//			sb.append("���ơ�");
//		
//		//4. �����������������𹬣�Ϊ�ճ���ɣ�����浽�빬��Ϊ���ն��ţ����浽�ҹ���Ϊ�Ǽ�������
//		if((t[0]==YiJing.YI || t[1]==YiJing.YI || d[0]==YiJing.YI || d[1]==YiJing.YI) && gong==3)
//			sb.append("�ճ���ɣ��");
//		if((t[0]==YiJing.BING || t[1]==YiJing.BING || d[0]==YiJing.BING || d[1]==YiJing.BING) && gong==9)
//			sb.append("���ն��š�");
//		if((t[0]==YiJing.DING || t[1]==YiJing.DING || d[0]==YiJing.DING || d[1]==YiJing.DING) && gong==7)
//			sb.append("�Ǽ�������");
//		
//		//5. ����֮�飺������ļ�������ϵ���ݻ���������ߣ�Ϊ�������顢���¾㼪��
//		if((t[0]==YiJing.YI || t[1]==YiJing.YI || d[0]==YiJing.YI || d[1]==YiJing.YI ||
//				t[0]==YiJing.BING || t[1]==YiJing.BING || d[0]==YiJing.BING || d[1]==YiJing.BING ||
//				t[0]==YiJing.DING || t[1]==YiJing.DING || d[0]==YiJing.DING || d[1]==YiJing.DING) &&
//				(daoqm.gInt[1][1][gong]==QiMen.SHENYIN || daoqm.gInt[1][1][gong]==QiMen.SHENDI || 
//						daoqm.gInt[1][1][gong]==QiMen.SHENHE || daoqm.gInt[1][1][gong]==QiMen.SHENTIAN ) && 
//						(daoqm.gInt[3][1][gong]==QiMen.MENKAI || daoqm.gInt[3][1][gong]==QiMen.MENXIU || daoqm.gInt[3][1][gong]==QiMen.MENSHENG)) 
//			sb.append("���顢");
//		
//		//6. ����»λ���ҵ��𡢱����㡢������Ϊ��»֮λ
//		if(((t[0]==YiJing.YI || t[1]==YiJing.YI || d[0]==YiJing.YI || d[1]==YiJing.YI) && gong==3) ||
//				((t[0]==YiJing.BING || t[1]==YiJing.BING || d[0]==YiJing.BING || d[1]==YiJing.BING) && gong==4) ||
//				((t[0]==YiJing.DING || t[1]==YiJing.DING || d[0]==YiJing.DING || d[1]==YiJing.DING) && gong==9))
//				sb.append("��»��");
//		
//		//7. ������ϣ��Ҹ�������������Ϊ��ϣ����׼�Ϊ�Ǻϣ��ü��ţ������к�֮�����ͽ⡢�˽ᡢƽ�֡�ƽ�֡�
//		if(((t[0]==YiJing.YI || t[1]==YiJing.YI) && (d[0]==YiJing.GENG || d[1]==YiJing.GENG)) ||
//				((t[0]==YiJing.GENG || t[1]==YiJing.GENG) && (d[0]==YiJing.YI || d[1]==YiJing.YI)) ||
//				((t[0]==YiJing.BING || t[1]==YiJing.BING) && (d[0]==YiJing.XIN || d[1]==YiJing.XIN)) ||
//				((t[0]==YiJing.XIN || t[1]==YiJing.XIN) && (d[0]==YiJing.BING || d[1]==YiJing.BING)) ||
//				((t[0]==YiJing.DING || t[1]==YiJing.DING) && (d[0]==YiJing.REN || d[1]==YiJing.REN)) ||
//				((t[0]==YiJing.REN || t[1]==YiJing.REN) && (d[0]==YiJing.DING || d[1]==YiJing.DING)))
//				sb.append("��ϡ�");
//		else if(((t[0]==YiJing.WUG || t[1]==YiJing.WUG) && (d[0]==YiJing.GUI || d[1]==YiJing.GUI)) ||
//				((t[0]==YiJing.GUI || t[1]==YiJing.GUI) && (d[0]==YiJing.WUG || d[1]==YiJing.WUG)) ||
//				((t[0]==YiJing.JI || t[1]==YiJing.JI) && (gong==zhifugong)) ||
//				((gong==zhifugong) && (d[0]==YiJing.JI || d[1]==YiJing.JI)))
//				sb.append("�Ǻϡ�");
//		
//		sb = sb.delete(sb.length()-1, sb.length());
//		sblack(sb.toString());
//		swhite(speat(COL-sb.length(),FILL1));
//	}
//	/**
//	 * ��������У�
//	 * �ո�smallblack-2,����bigblack(bigred)-1���ո�smallblack-4������̳����smallblack-10
//	 */
//	private void pLine4(int gong) throws BadLocationException{
//		int i=0;
//		String str = "";
//		if(gong==5) {
//			swhite(speat(COL,FILL1));  //�����幬��������¸ɡ������̳����Ĺ���ѷ�Ӧ���������ڹ���������ڹ���
//			return ;
//		}
//		swhite(speat(LINE4[0],FILL1));
//		
//		int shen = daoqm.gInt[1][1][gong]; //��������
//		if(shen == QiMen.SHENFU) bred(QiMen.bs1[shen]);
//		else bblack(QiMen.bs1[shen]);
//		  
//		swhite(speat(LINE4[1],FILL1));
//		
//		if(pub.isTDXing(gong)) { //������������
//			str += "��";
//			i++;
//		}
//		if(pub.isTDChong(gong)) {  //�������̳�
//			str += "��";
//			i++;
//		}
//		if(pub.isTDGanHe(gong)) {//�����ظ�����
//			str += "��";
//			i++;
//		}
//		if(pub.isTDG3He(gong)) {//�����ع�����
//			str += "�\";
//			i++;
//		}else if(pub.isTDZi3He(gong)) {//�����ذ�ϣ��������������
//			str += "�Q";
//			i++;
//		}
//		sblack(str);
//		swhite(speat(LINE4[2]-i,FILL1));	
//		bwhite(speat(LINE4[3],FILL1));		
//		swhite(speat(LINE4[4],FILL2));
//	}
//	
//	/**
//	 * ��������У�
//	 * ���Ź�����˥smallblack-3������bigblack(bigred)-1�����ǹ�����˥smallblack-4������bigblack-2���ͳ����Ĺsmallblack-6
//	 */
//	private void pLine5(int gong) throws BadLocationException{
//		int i=0;
//		String str = "";
//		if(gong==5) {    //�������幬��������̸��������乬����˥����
//		//���̸��ڹ���������˥
//			int tpjgong = daoqm.getTpJigong();
//			String tgangws = QiMen.gan_gong_wx2[daoqm.gInt[4][5][5]][tpjgong];
//			int itganyws = SiZhu.TGSWSJ[daoqm.gInt[4][5][5]][SiZhu.yz];
//	  	String tganyws = SiZhu.TGSWSJNAME[itganyws];
//
//			swhite(speat(LINE5[0]+2,FILL1));
//			bwhite(FILL1);
//			swhite(speat(LINE5[1],FILL1));
//			sblack(tgangws+tganyws);
//			swhite(speat(LINE5[2],FILL1));
//			bwhite(speat(2,FILL1));
//			swhite(speat(LINE5[3],FILL1));
//			swhite(speat(LINE5[4], FILL1));
//			swhite(speat(LINE5[5],FILL2));
//			return ;
//		}
//		//���̸��ڹ���������˥
//		String tgangws = QiMen.gan_gong_wx2[daoqm.gInt[2][3][gong]][gong];
//		int itganyws = SiZhu.TGSWSJ[daoqm.gInt[2][3][gong]][SiZhu.yz];
//  	String tganyws = SiZhu.TGSWSJNAME[itganyws];
//  	//����
//  	String mengws =  QiMen.men_gong2[daoqm.gInt[3][1][gong]][gong];
//  	String menyws =  QiMen.men_yue[daoqm.gInt[3][1][gong]][SiZhu.yz];
//		
//		sblack(mengws+menyws);
//		swhite(speat(LINE5[0],FILL1));
//		
//		//��������
//		if(gong==zhishigong) bred(QiMen.bm1[daoqm.gInt[3][1][gong]]);  
//		else bblack(QiMen.bm1[daoqm.gInt[3][1][gong]]);
//			
//		swhite(speat(LINE5[1],FILL1));
//		sblack(tgangws+tganyws);
//		swhite(speat(LINE5[2],FILL1));
//		if(daoqm.gInt[2][3][gong]==rg || daoqm.gInt[2][3][gong]==sg) {
//			bblue(YiJing.TIANGANNAME[daoqm.gInt[2][3][gong]]);
//		}else{
//			bblack(YiJing.TIANGANNAME[daoqm.gInt[2][3][gong]]);
//		}
//		if(daoqm.isTpJigong(gong)) {
//			bblack(YiJing.TIANGANNAME[daoqm.gInt[4][5][5]]);
//		}else {
//			bwhite(speat(1,FILL1));
//		}
//		swhite(speat(LINE5[3],FILL1));
//		
//		if(!pub.isTDG3He(gong)) {//��ع����ϲ����ж��ˣ���ǰ�������֧ʱ���ж�
//			if(pub.isTG6He(gong)) {//�Ƿ������빬����
//				i++;
//				str += "��";
//			}else if(pub.isTG3He(gong)) {//�Ƿ���
//				i++;
//				str += "Ǣ";
//			}
//		}
//		if(pub.isJixing(gong)) {//�Ƿ������ǻ���
//			i++;
//			str += "��";
//		}
//		if(pub.isTGChong(gong)) {
//			i++;
//			str += "��";
//		}
//		if(pub.isTpTaohua(gong)) {
//			i++;
//			str += "��";
//		}
//		if(pub.isTGanMu(gong)) {
//			i++;
//			str += itganyws<=5 ? "��":"Ĺ";
//		}
//		sblack(str);
//		swhite(speat(LINE5[4]-i, FILL1));
//		swhite(speat(LINE5[5],FILL2));
//	}
//	
//	/**
//	 * ��������У�
//	 * ���ǹ�����˥smallblack-3������bigblack-1�����ǹ�����˥smallblack-4������bigblack-2���ͳ����Ĺsmallblack-6
//	 */
//	private void pLine6(int gong) throws BadLocationException{
//		int i=0;
//		String str = "";
//		if(gong==5) {  //�������幬��Ҫ���⴦��
//			int jigong = daoqm.getJiGong();
//			
//			//���̸��ڹ���������˥
//	  	String dgangws = QiMen.gan_gong_wx2[daoqm.gInt[4][5][5]][jigong];
//	  	int idganyws = SiZhu.TGSWSJ[daoqm.gInt[4][5][5]][SiZhu.yz];
//	  	String dganyws = SiZhu.TGSWSJNAME[idganyws];
//	  	//����
//	  	String xinggws =  QiMen.xing_gong[5][jigong];
//	  	String xingyws =  QiMen.xing_yue[5][SiZhu.yz];
//	  	
//			sblack(xinggws+xingyws);  //�����������˥
//			swhite(speat(LINE5[0],FILL1));  
//			bblack(QiMen.jx1[5]);  //������
//			swhite(speat(LINE5[1],FILL1));
//			sblack(dgangws+dganyws);   //������幬���̸���˥
//			swhite(speat(LINE5[2],FILL1));
//			if(daoqm.gInt[4][5][5]==rg || daoqm.gInt[4][5][5]==sg)  //������̸ɣ����Ϊ��ʱ��Ϊ��ɫ
//				bblue(YiJing.TIANGANNAME[daoqm.gInt[4][5][5]]);
//			else
//				bblack(YiJing.TIANGANNAME[daoqm.gInt[4][5][5]]);
//			bwhite(speat(1,FILL1));  //���һ����ո�
//			swhite(speat(LINE5[3],FILL1));
//			swhite(speat(LINE5[4], FILL1));
//			swhite(speat(LINE5[5],FILL2));
//			return ;
//		}
//		
//  	//���̸��ڹ���������˥
//  	String dgangws = QiMen.gan_gong_wx2[daoqm.gInt[4][5][gong]][gong];
//  	int idganyws = SiZhu.TGSWSJ[daoqm.gInt[4][5][gong]][SiZhu.yz];
//  	String dganyws = SiZhu.TGSWSJNAME[idganyws];
//  	//����
//  	String xinggws =  QiMen.xing_gong[daoqm.gInt[2][1][gong]][gong];
//  	String xingyws =  QiMen.xing_yue[daoqm.gInt[2][1][gong]][SiZhu.yz];
//  	
//		sblack(xinggws+xingyws);
//		swhite(speat(LINE5[0],FILL1));
//		bblack(QiMen.jx1[daoqm.gInt[2][1][gong]]);
//		swhite(speat(LINE5[1],FILL1));
//		sblack(dgangws+dganyws);
//		swhite(speat(LINE5[2],FILL1));
//		if(daoqm.gInt[4][5][gong]==rg || daoqm.gInt[4][5][gong]==sg)
//			bblue(YiJing.TIANGANNAME[daoqm.gInt[4][5][gong]]);
//		else
//			bblack(YiJing.TIANGANNAME[daoqm.gInt[4][5][gong]]);
//		if(daoqm.isJiGong(gong)) {
//			bblack(YiJing.TIANGANNAME[daoqm.gInt[4][5][5]]);
//		}else {
//			bwhite(speat(1,FILL1));
//		}
//		swhite(speat(LINE5[3],FILL1));
//		
//		if(!pub.isTDG3He(gong)) {//��ع����ϲ����ж��ˣ���ǰ�������֧ʱ���ж�
//			if(pub.isDG6He(gong)) {//�Ƿ�����빬����
//				i++;
//				str += "��";
//			}else if(pub.isDG3He(gong)) {//�Ƿ���
//				i++;
//				str += "Ǣ";
//			}
//		}
//		if(pub.isDpJixing(gong)) {//�Ƿ������ǻ���
//			i++;
//			str += "��";
//		}
//		if(pub.isDGChong(gong)) {
//			i++;
//			str += "��";
//		}
//		if(pub.isDpTaohua(gong)) {
//			i++;
//			str += "��";
//		}
//		if(pub.isDGanMu(gong)) {
//			i++;
//			str += idganyws<=5 ? "��":"Ĺ";
//		}
//		sblack(str);
//		swhite(speat(LINE5[4]-i, FILL1));
//		swhite(speat(LINE5[5],FILL2));
//	}
//	/**
//	 * ��������У�
//	 * �ո�smallblack-4�����̰���smallblack(smallred)-1���ո�smallblack-5������smallblack-1���ո�8��
//	 */
//	private void pLine7(int gong) throws BadLocationException{
//		if(gong==5) {
//			swhite(speat(COL,FILL1));
//			return ;
//		}
//		swhite(speat(LINE7[0],FILL1));
//		swhite(speat(LINE7[1],FILL2));
//		
//		//���̰��񣬼����̸��������乬�İ���
//		int dpbs = daoqm.gInt[1][1][pub.getTianGong(daoqm.gInt[4][5][gong], 0)];
//		if(dpbs==QiMen.SHENFU) sred(QiMen.bs1[dpbs]);  
//		else sblack(QiMen.bs1[dpbs]);
//		
//		swhite(speat(LINE7[2],FILL1));
//		sblack(YiJing.TIANGANNAME[daoqm.gInt[4][5][daoqm.gInt[3][1][gong]]]);  //���ɣ���
//		swhite(speat(LINE7[3],FILL1));
//		swhite(speat(LINE7[4],FILL2));
//	}
//	
//	private void bwhite(String str) throws BadLocationException {
//		bwhite(doc.getLength(), str);
//	}
//	private void bwhite(int len, String str) throws BadLocationException{
//		doc.insertString(len, str, bigwhite);
//	}
//	private void swhite(String str) throws BadLocationException {
//		swhite(doc.getLength(), str);
//	}
//	private void swhite(int len, String str) throws BadLocationException{
//		doc.insertString(len, str, smallwhite);
//	}
//	private void spink(String str) throws BadLocationException {
//		spink(doc.getLength(), str);
//	}
//	private void spink(int len, String str) throws BadLocationException{
//		doc.insertString(len, str, smallpink);
//	}
//	private void sblue(String str) throws BadLocationException {
//		sblue(doc.getLength(), str);
//	}
//	private void sblue(int len, String str) throws BadLocationException{
//		doc.insertString(len, str, smallblue);
//	}
//	private void bblue(String str) throws BadLocationException {
//		bblue(doc.getLength(), str);
//	}
//	private void bblue(int len, String str) throws BadLocationException{
//		doc.insertString(len, str, bigblue);
//	}
//	private void bblack(String str) throws BadLocationException {
//		bblack(doc.getLength(), str);
//	}
//	private void bblack(int len, String str) throws BadLocationException{
//		doc.insertString(len, str, bigblack);
//	}
//	private void sblack(String str) throws BadLocationException {
//		sblack(doc.getLength(), str);
//	}
//	private void sblack(int len, String str) throws BadLocationException{
//		doc.insertString(len, str, smallblack);
//	}
//	private void bred(String str) throws BadLocationException {
//		bred(doc.getLength(), str);
//	}
//	private void bred(int len, String str) throws BadLocationException{
//		doc.insertString(len, str, bigred);
//	}
//	private void sred(String str) throws BadLocationException {
//		sred(doc.getLength(), str);
//	}
//	private void sred(int len, String str) throws BadLocationException{
//		doc.insertString(len, str, smallred);
//	}
//	private void newLine() throws BadLocationException {
//		doc.insertString(doc.getLength(), "\r\n", null);
//	}
//	
//	/**
//	 * ѭ����������ո��ָ�����ַ�
//	 */
//	private String speat(int len, String fillstr) {
//		StringBuilder sb = new StringBuilder();
//		for(int i=0; i<len; i++) sb.append(fillstr);
//		
//		return sb.toString();
//	}
//	
//	int zhishigong ,zhifugong;  //ֵʹ��ֵ����
//	int ng ,yg, rg, sg;  //ȥ���׿�ͷ���ת�����
//	
//	ResultPanel resultPane;  //չ�ֽ�������
//	MyTextPane text;				 //��ʾ�����������Ϣ
//	Document doc ;					 //��ʾ�ṹ���ĵ�
//	SimpleAttributeSet smallblack;  //С��ɫ����
//	SimpleAttributeSet bigblack;    //���ɫ����Ӵ�
//	SimpleAttributeSet smallred;    //С��ɫ����
//	SimpleAttributeSet bigred;      //���ɫ����Ӵ�
//	SimpleAttributeSet smallwhite;  //С��ɫ����
//	SimpleAttributeSet bigwhite;   	//���ɫ����
//	SimpleAttributeSet smallblue;   //С��ɫ����
//	SimpleAttributeSet bigblue;   	//����ɫ����
//	SimpleAttributeSet smallpink;   //ˮ��ɫС����
//
//	
//	public QimenGeju3(DaoQiMen daoqm, QimenPublic pub) {
//  	this.daoqm = daoqm;
//  	this.pub = pub;
//  }
//	
//	private void init() throws BadLocationException {
//		text = resultPane.getTextPane();
//		doc = text.getDocument();
//		doc.remove(0, doc.getLength());
//		
//		smallblack = new SimpleAttributeSet();//MAGENTA ORANGE
//		StyleConstants.setForeground(smallblack, Color.BLACK);
//		StyleConstants.setFontSize(smallblack, SMALL);
//		
//		bigblack = new SimpleAttributeSet();
//		StyleConstants.setForeground(bigblack, Color.BLACK);
//		StyleConstants.setBold(bigblack, true);
//		StyleConstants.setFontSize(bigblack, BIG);
//		
//		smallred = new SimpleAttributeSet();
//		StyleConstants.setForeground(smallred, Color.RED);  			
//		StyleConstants.setFontSize(smallred, SMALL);
//		
//		bigred = new SimpleAttributeSet();
//		StyleConstants.setForeground(bigred, Color.RED);
//		StyleConstants.setBold(bigred, true);
//		StyleConstants.setFontSize(bigred, BIG);
//		
//		smallpink = new SimpleAttributeSet();
//		StyleConstants.setForeground(smallpink, Color.MAGENTA);  
//		StyleConstants.setFontSize(smallpink, SMALL);
//
//		smallblue = new SimpleAttributeSet();
//		StyleConstants.setForeground(smallblue, Color.BLUE);  		
//		StyleConstants.setFontSize(smallblue, SMALL);
//		
//		bigblue = new SimpleAttributeSet();
//		StyleConstants.setForeground(bigblue, Color.BLUE);  
//		StyleConstants.setBold(bigblue, true);
//		StyleConstants.setFontSize(bigblue, BIG);
//		
//		smallwhite = new SimpleAttributeSet();
//		StyleConstants.setForeground(smallwhite, Color.WHITE);  
//		StyleConstants.setFontSize(smallwhite, SMALL);
//		
//		bigwhite = new SimpleAttributeSet();
//		StyleConstants.setForeground(bigwhite, Color.WHITE);
//		StyleConstants.setBold(bigwhite, true);
//		StyleConstants.setFontSize(bigwhite, BIG);
//		
//		zhifugong = daoqm.getZhifuGong();
//		zhishigong = daoqm.getZhishiGong();  //ֵʹ��ֵ����
//		ng = pub.getTiangan(SiZhu.ng, SiZhu.nz);  //ȥ���׿�ͷ���ת�����
//		yg = pub.getTiangan(SiZhu.yg, SiZhu.yz);
//		rg = pub.getTiangan(SiZhu.rg, SiZhu.rz);
//		sg = pub.getTiangan(SiZhu.sg, SiZhu.sz);
//	}
}