package com.xia.design;
import java.util.*;
import com.xia.draw.MainDraw;

/* 
 * @Author:made by xia.shunying
 * @Date:2016.4 �ڹ���������ѧ������ѧ��
 * @Function:��Ϊˮ�ַ���������Ƴ���(com.xia.design)����ӹ������ԣ������ԣ��������ԣ�Ч���������߻��Ƴ���(com.xia.draw)
 * @Method:��Test.java������������ݼ��ߴ����ݣ����и�Main.class���ɵõ��������ݡ�
 * @������������ͼҲ����Main.java���޸������ͼ������(���û�ͼģ�飬���л�ͼģ��Ҳ���Ը�������������)��
 * @��ǣ���ѧJavaĿ��Ϊѧһ��������Ҳ����Ժ͵������ϣ���������Ŀ�ġ�
 */
public class Main {
	public static  double SN;
	public static  double PN;
	public static double UPHI;
	public static double COSPHIN;//edingonglvyinshu
	public static  double UN;
	public static double IN;
	public static double IPHI;
	public static double Beta;
	public static double IA;//meizhiludianliu
	public static double IS;//dingzicaodianliu
	public static double P;//jiduishu
	public static double q;//meijimeixiangcaoshu
	public static double NN;
	public static double NR;//feiyizhuansu
	public static double NS;//meicaoyouxiaodaotishu
	public static double FN;
	public static int M;//xiangshu
	public static double D1;
	public static double DI;
	public static int Z;//dingzicaoshu
	public static int Y;//raozuhechengjieju
	public static int Y1;//raozudiyijieju
	public static double Kdp1;//jiboraozuxishu
	public static double Kp1;//raozujiboduanjuxishu
	public static double Kd1;//raozujibofenbuxishu
	public static double A;//dianfuhe
	public static double WPHI;//ÿ�മ������
	public static int a;//binglianzhilushu
	public static int b;
	public static int c;
	public static int d;
	public static double t1;//dingzichichiju
	public static double tal;//jiju
	public static double PHI1;//jibocitong
	public static double DELTA;//qixi  (cm)
	public static double DELTAMax;
	public static double bp;//jixuekuandu
	public static double ALPHAp;//jihuxishu
	public static double B;
	public static double B1;
	public static double Kphi;//cichangboxingxishu
	public static double C;
	public static double D;
	public static double Klamda;//jihuxitongxishu
	public static double PHI;//kongzaiedingdianyashimeijicitong
	public static double PHIlamda;//kongzaiedingdianyashijixuebufencitong
	public static double _a;//daoxiangao(mm)
	public static double _b;//daoxiankuan(mm)
	public static double Acu;
	public static double _C;//xianbangbinglianguxianshu
	public static double Ac;//youxiaodaotijiemian
	public static double J;//dingzidianmi
	public static double HeatLoad;//refuhe
	public static double bs;//dingzicaokuandu(cm)
	public static double hs;//dingzicaogaodu(cm)
	public static double hk;//caoxiegaodu(cm)
	public static double deltai;//dingzixianquanjuyuandanbianhoudu(cm)
	public static double t_1_3;//dingzi1/3chigaochuchiju
	public static double t_1_2;//dingzi1/2chigaochuchiju
	public static double bt;//dingzichidingchuchikuan
	public static double bt_1_3;//dingzi1/3chigaochuchikuan
	public static double bt_1_2;//dingzi1/2chigaochuchikuan
	public static double hj;//dingziegao
	public static double Lj;//dignzieciluchang
	public static double bv;//dignzitiexinjingxiantongfengcaokuandu(cm)
	public static int nv;//tongfengcaoshu
	public static double lt;//dingzitiexinzongchangdu
	public static double l;//wutongfengcaodignzitiexinchangdu
	public static double tv;//xianglintongfengcaodepingjunjuli
	public static double KFe;//tiexindieyaxishu
	public static double lef;//dingzitiexinyouxiaochangdu(cm)
	public static double lt_per_tal;//bizhi lt/tal
	public static double a1;//dingziqixinbianyuantixinggaodu
	public static double c1;//dingziqiexinbianyuantixingkuandu
	public static double lt1;//dingzitiexinjisuanchangdu
	public static double lm;//zhujijishenchangdu
	public static double lp;//zhujijixuechangdu
	public static double lp1;//zhujijixuejisuanchangdu
	public static double l0;//zhouxiangqixijisuanchangdu
	public static double Bdelta;//jixueshagnqixipingjunxitongmidu
	public static double Bt_1_3;//dingzi1/3chigaochucitongmidu
	public static double Bt_1_2;//dingzi1/2chigaochucitongmidu
	public static double Bj;//dignziecitongmidu
	public static double DELTA1;//jisuanqixi(cm)
	public static double t2;//zunitiaojieju
	public static double bsh;//zuniraozucaokaikoukuandu
	public static double hsh;//zuniraozucaokaikougaodu
	public static double Kdelta1;//dingzichiqixixishu
	public static double Kdelta2;//dingzijingxiangtongfengcaoqixixishu
	public static double Kdelta3;//dingzizuniraozucaoqixixishu
	public static double Kdelta;//zongqixixishu
	public static double Fdelta;//qixiciweijiang
	public static double Fa;//dingziraozujuxingcidongshi
	public static double Kad;//dignziraozuzhizhoudianshufanyingxishu
	public static double Fad;//dingziraozudianshufanyingzhizhoucidongshi
	public static double Xad;//zhizhoudianshufanyingdiankang
	public static double Kq;//dingzijiaozhouyuzhizhoudianshufanyingjibocitongbi
	public static double Xaq;//jiaozhoudianshufanyingdiankang
	public static double Xsigma;//dingziraozuloukang
	public static double Xd;//zhizhoutongbudiankang
	public static double Xq;//jiaozhoutongbudiankang
	public static double DELTAp;//cijiyabanhoudu
	public static double hm;//jishengaodu
	public static double bm;//jishenkuandu
	public static double hp;//jixuegaodu
	public static double lm1;//cijitiexinjisuanchangdu
	public static double ap;//cijijiegouchicun
	public static double dt;
	public static double cp;
	public static double talm;
	public static double lamdapl;//jixuezhijianloucidao
	public static double lamdaml;//jishenzhijianloucidao
	public static double lamdamb;//cijiduanmianzhijianlouxidao
	public static double lamdam_plus_p;//cijizongloucidao
	public static double LAMDA;//shunbianguochengcijizongloucidao
	public static double Xsigma2;//liciraozuzongdiankang
	public static double Xsigmaf;//liciraozukoukang
	public static double Xd1;//zhizhoushunbiandiankang
	public static double Xq1;//jiaozhoushunbiandiankang
	public static double nB;//zunitiaogenshu
	public static int dampringtype;//zunihuanleixing
	public static double Xsigmaq;//zuniraozujiaozhouloukangs
	public static int damphere;//youwuzuni
	public static double Xsigmad;//zunizhizhouloukang
	public static double Xd2;//zhizhouchaoshunbiandiankang
	public static double Xq2;//jiaozhouchaoshunbiandiankang
	public static double X2_0;//fuxudiankang(duanlushi)
	public static double X2_1;//fuxudiankang(gongzuoyudadewaidiankangshi)
	public static double X0;//lingxudiankang
	public static int windingtype;//raozuxingshi
	public static double lE;//dingziraozuduanbupingjunbanzachang
	public static double lc;//dingziraozupingjunzachang
	public static double R_15;//15oCdingzimeixiangdianzu
	public static double R_75;
	public static double R_per;//dignziraozudianzu
	public static double af;//tongxianhoudu
	public static double bf;//tongxiankuandu
	public static double Wf;//liciraozumeijizashu
	public static double Af;//tongxianjiemianji
	public static double lcf;//licixianquanmeizapingjunchangdu
	public static double Rf_15;//liciraozudianzu
	public static double Rf_75;
	public static double Rf_120;
	public static double Rf_130;
	public static double Rf_per;//liciraozudianzu biaoyaozhi
	public static int dampmate;//zunihuancaizhi
	public static int windingmate;//liciraozucaizhi
	public static double CB;//zunidianzuxishu
	public static double CR;//tongdianzuxishu
	public static double GamaB;//zunitiaobizhong
	public static double GamaR;//zunihuanbizhong
	public static double dB;//zunitiaozhijing(mm)
	public static double lB;//zunitiaochangdu(cm)
	public static double AB;//yuanzunitiaojiemianji(mm*mm)
	public static double aR;//zunihuanhoudu
	public static double bR;//zunihuankuandu
	public static double AR;//zunihuanjiemianji (cm*cm)
	public static double DR;//zunihuanpingjunzhijing
	public static double RDd_per;//zhizhouzuniraozudignzu
	public static int isdamperlink;//shifouzunihuanlianjie
	public static double RDq_per;//jiaozhouzuniraozudiankang
	public static double Td01;//diangzikailuliciraozushijianchangshu
	public static double TDd01;//dingzihelicikaolushizhizhouzuniraozushijianchangshu
	public static double TDq01;//dignziraozukaolushijiaozhouzuniraozushijianchangshu
	public static double Td1;//dignziraozuduanlushiliciraozushijianchangshu
	public static double Td02;//dignziraozukailuliciraozuduanlushizhizhouzuniraozushijianchangshu
	public static double Td2;//dingziraozujiliciraozuduanlushizhizhouzuniraozushijianchangshu
	public static double Tq2;//dingziraozuduanlushijiaozhouzuniraozushijianchangshu
	public static double Ta;//liciraozuduanlushidingziraozushijianchangshu
	public static double Td31;//jiduansanxiangduanlushishunbiandianliushuaijianshijianchangshu
	public static double Td32;//jiduansanxiangduanluchaoshunbiandianliushuaijianshijianchangshu
	public static double Ta3;////jiduansanxiangduanlushidingzidianliufeizhouqifenliangshuaijianshijianchangshu
	public static double Td21;//jiduanliangxiangduanlushishunbiandianliushuaijianshijianchangshu
	public static double Td22;//jiduanliangxiangduanlushichaoshunbiandianliushuaijianshijianchangshu
	public static double Ta2;//jiduanliangxiangduanlushifeizhouqifenliangshuijianshijianchangshu
	public static double Td11;//jiduandanxiangduanlushishunbiandianliushuaijianshijianchangshu
	public static double Td12;//jiduandanxiangduanlushichaoshunbiandianliushuaijianshijianchangshu
	public static double Ta1;//jiduandanxiangduanlushidingzidianliufeizhouqifenliangshuaijianshijianchangshu
	public static double GFei;//dingzichizhong
	public static double GFej;//dingziezhong
	public static String Si_Fe_mate;//guigangpiancaizhi
	public static double Kr;//binglianguxianjiandehuanliuxishu
	public static double Ks;//wuoliusunhaoxishu
	public static double KF;//dingziraozudefeilidexishu
	public static double PFei;//kongzaiedingdianyashidingzichizhongsunhao
	public static double PFej;//kongzaiedingdianyashidingziezhongsunhao
	public static double B3;//duanludianliuweiedingdianliushicichangsancixiebozaidingzichizhongcitongmidu
	public static double Pt3;//duanludianliuweiedingdianliushicichangzhongsancixiebozaidingzichizhongyinqidefujiasunhao
	public static double W1;//tiehaozaidingzineiquanchanshengdedanweirefuzai
	public static double W2_A;//A jijueyuantonghaozaidingzineiyuanchanshengdedanweirefuzai
	public static double W2_B;//B jijueyuan
	public static double W3;//tonghaozaixianquanbiaomianchanshengdedanweirefuzai
	public static double SITAFe;//tiexinduikongqidewensheng
	public static double SITAi;//xianquanjueyuanwendujiang
	public static double SITAE;//xianquanduanbubiaomianduikongqidewensheng
	public static double SITAmax;//dingziyouxiaobufendezuigaowensheng
	public static double SITACu;//dingzixianquanduikongqidepingjunwensheng
	public static double Fi;//dingzichixiweijiang
	public static double Fj;//dingziedeciweijiang
	public static double sigmam;//cijiloucixishu
	public static double PHIm;//jishengenbucitong
	public static double Ap;//cijiyabanjiemianji
	public static double Am;//cijitiexinjiemianji
	public static double Bm;//jishengenbudecitongmidu
	public static double sigmap;//jixuedeloucixishu
	public static double PHIp;//jishenshangbucitongmi
	public static double Bp;//jishenshangbucitongmidu
	public static double Bm_1_2;//cijidepingjuncitongmidu
	public static double Fm;//cijideciweijiang
	public static double Fj2;//zhuanzieyucijijiefengchuzhiciweijiang
	public static double Ff0;//edingdianyaxiakongzaiciweijiang
	public static double Fk;//duanludianliuweiedingdianliushideciweijiang
	public static double Kc;//duanlubi
	public static double Xsigmat;//dingziraozuzongloukang
	public static double PHI1_cosphi0;//cos(PHI)=0duiyingedingdianyaUPHIdemeijicitong
	public static double Bdelta1_cosphi0;//qixipingjuncitongmidu
	public static double Fdelta1_cosphi0;//kongqixideciweijiang
	public static double Bj1_cosphi0;//dingziedecitongmidu
	public static double Fj1_cosphi0;//dingziedeciweijiang
	public static double Bt_1_3_cosphi0;//dingzichidecitongmidu
	public static double Ft_1_3_cosphi0;//dingzichideciweijiang
	public static double sigmam1_cosphi0;//cijiloucixishu
	public static double sigmap1_cosphi0;//jixuedeloucixishu
	public static double Bm1_cosphi0;//jishengenbudecitongmidu
	public static double Bp1_cosphi0;//jishenshangbudecitongmidu
	public static double Bm_1_2cosphi0;//cijidepingjuncitongmidu
	public static double Fm1_cosphi0;//cijideciweijiang
	public static double Fj21_cosphi0;//zhuanzieyucijijiefengchuzhiciweijiang
	public static double EpsilonF;//edingqianfuan cos(phi)=0 guolishidezongciweijiang
	public static double Ffn;//edinglicicidongshi
	public static double If0;//kongzaiedingdianyashidelicidianliu
	public static double Ifn;//edingfuzaishidelicidianliu
	public static double Jf;//edingfuzaishiliciraozudedianliumidu
	public static double Uf0;//kongzaishiliciraozudehuahuandianya
	public static double Ufn_A;//edingfuzaishiliciraozudehuanhuandianya A jijueyuan
	public static double Ufn_B;//B jijueyuan
	public static double DELTAUf;//jidianhuanshangdelicidianyazengzhangsudu
	public static double Uf;//zhiliulicijideedingdianya
	public static double If;//zhiliulicijideedingdianliu
	public static double Pf;//zhiliulicijideedinggonglv (kW)
	public static double Ufmax;//licixitongdedingzhidianya (morenzhiliulicijixitong)
	public static double Ifmax;//zhiliulicijidezuidalicidianliu
	public static double Pfmax;//zhiliulicijideshunshizuidagonglv
	public static double h2;//xianquancebianmiandegaodu
	public static double A2;//zhuanzixianquandedianfuhe
	public static double W21_A;//licisuanhaozaicijixianquancebiaomianchanshengdedanweirefuzai
	public static double W21_B;//B jijueyuan
	public static int AirCool;//tongfengfangshi
	public static double W2;//zhuanzixianquandebiaomiansanrexishu
	public static double SITAf;//zhuanzixianquanduikongqidewensheng
	public static double DELTApp;//cijichongpianhoudu
	public static double Adelta1;//jixuebiaomiandejisuanmianji
	public static double PFep0;//kongzaiedingdianyashijixuebiaomiandefujiasunhao
	public static double PFe;//kongzaishizongtiehao
	public static double Pcu;//edingdianliushidingziraozutonghao
	public static double Pcu3;//edingdianliushishuangcengdingziraozudefujiasunhao
	public static double Ppl;//duanludinaliuweiedingdianliushidingzicichangzhongchixiebozaijixuebiaomianjizuniraozuzhongchanshengdefujiasunhao
	public static double Pkv;//duanludianliuwei...jixuebiaomianchanshengdefujiasunhao
	public static double Psigmad;//duanludianliuweiedingdianliushizaidingzichiyabanjiduangaishangdefujiasunhao
	public static double Pk;//duanludianliuweiedingdianliushidezongsunhao
	public static double Pcuf;//edingfuzai.dianya,gongonglvyinshushidelicisunhao
	public static double Pfv;//fengmosunhao
	public static double Pmcc;//zongjixiesunhao
	public static double EPSILONP;//zongsunhao
	public static double Eta;//fadianjiedingfuzaishidexiaolv
	public static double GFe;//fadianjidingziyouxiaotiezhong
	public static double Gcu;//dingziraozutongzhong
	public static double Gcuf;//liciraozutognzhong
	public static double GB;//zunitiaozhongliang
	public static double GR;//zunihuanzhongliang
	public static double Gcut;//fadianjiyouxiaozhongliang
	public static double gFe;//fadianjidanweirongliangyouxiaotiezhongliang
	public static double Cliyong;//fadianjideliyongxishu
	public static double CA;//fadianjidedianjichangshu
	public static double gCu;//fadianjidanweirongliangyouxiaotongzhongliang
	public static int Y2;//dierjieju
	public static double vN;//zhuanziyuanzhousudu

	public static double ZM;


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Scanner scanner = inputParam();
		Test.inputParam();//�������
		
		
		solute();//���
		//MainDraw.solutePe_delta();//��ͼ
		//MainDraw.soluteEta_P2();
		//MainDraw.soluteU_I();
		//MainDraw.soluteIf_I();
	}

	public static void solute() {
		Tables tables=new Tables();
		Diagrams diagrams=new Diagrams();
		
		
		//SN=PN/COSPHIN;//3
		PN=SN*COSPHIN;//3
		UPHI=UN/(Math.sqrt(3));//5
		IN=(SN*1000)/(Math.sqrt(3)*UN);//6
		
		IPHI=IN;//7
		
		 ZM=UPHI/IPHI;//zukangbiaoyaozhijizhi
		P=(int)Math.round((120*FN)/(NN*2));//11
		q=(Z*1.0)/(6*P);//16
		//slouteABC(Z,6*P);
		IA=IPHI/a;//19
		IS=NS*IA;//20
		t1=(3.14*DI)/Z;//21  ( cm)
		System.out.println("t1 "+t1);
		tal=(3.14*DI)/(2*P);//22 (cm)
		//System.out.println("tal "+tal);
		A=IS/t1;//23  (A/cm) (1)
		
		
		//A=1.02*(IS/t1);    //(2)
		/*boolean flag=true;//false;
		while(flag){
			A=1.02*A;
			
			t1=IS/A;
			double DI1=(t1*Z)/3.14;
			double deltaD=DI1-DI;
			double D11=D1+deltaD;
			DI=DI1;
			D1=D11;
			flag=false;
		}*/
		//A=0.98*(IS/t1);	 //(3)
		/*while(flag){
			A=0.98*A;
			
			t1=IS/A;
			double DI1=(t1*Z)/3.14;
			double deltaD=DI1-DI;
			double D11=D1+deltaD;
			DI=DI1;
			D1=D11;
			flag=false;
		}*/
		
		
		Y=Math.round(6*(b*d+c)/d);//24
		Beta=Y1/(3*q);
		Kd1=0.5/(  (b*d+c) * Math.sin( 3.14/((b*d+c)*6) )  );
		Kp1=Math.sin((Beta*3.14)/2);
		Kdp1=Kd1*Kp1;
		System.out.println("Y "+Y+" Y1 "+Y1+" beta "+Beta+" Kp1 "+Kp1+" Kd1 "+Kd1+" Kdp1 "+Kdp1);
		//queryQ_Beta__Y1_Kdp1_Kp1(tables,b,c,b);//24-29
		
		
		//Kd1=0.5/((b*d+c)*Math.sin((3.14/6)/(b*d+c)));
		WPHI=(Z*NS)/(6*a);//34
		//System.out.println("WPHI: "+WPHI);
		
		PHI1=(UPHI*100000000)/(4.44*FN*WPHI*Kdp1);//35
		
		double delta_p_tal=DELTA/tal;//37
		double deltamax_p_delta=DELTAMax/DELTA;//38
		ALPHAp=bp/tal;
		
		B=queryB(diagrams, deltamax_p_delta,ALPHAp);//41
		B1=queryB1(diagrams, deltamax_p_delta,delta_p_tal);//41
		Kphi=B*B1;//41
		C=queryC(diagrams,ALPHAp,delta_p_tal);
		D=queryD(diagrams,deltamax_p_delta,delta_p_tal);
		Klamda=C*D;//42
		
		PHI=Kphi*PHI1;//43
		//System.out.println("PHI: "+PHI+"Kphi: "+Kphi+"PHI1 "+PHI1);
		
		PHIlamda=Klamda*PHI;//44
		Acu=query_Acu(_a,_b);
		Ac=Acu*_C;//46
		//System.out.println("Ac "+Ac+"Acu "+Acu);
		
		
		J=IA/Ac;//47
		HeatLoad=A*J;//48
		t_1_3=(3.14*(DI+((2*hs)/3)))/Z;//53
		t_1_2=(3.14*(DI+hs))/Z;//54
		System.out.println("t_1_3"+t_1_3+"t_1_2"+t_1_2);
		bt=t1-bs;//55
		bt_1_3=t_1_3-bs;//56
		bt_1_2=t_1_2-bs;//57
		System.out.println("bt "+bt+"bt_1_3 "+bt_1_3+"bt_1_2 "+bt_1_2);
		hj=(D1-DI)/2-(hs+0.5);//58
		System.out.println("hj"+hj);
		
		Lj=(3.14*(D1-hj))/(2*P);//59
		l=lt-bv*nv;//62
		tv=lt/(nv+1);//63
		lef=KFe*l;//65
		lt_per_tal=lt/tal;//66
		lt1=lt-2*a1+(2*a1*DELTA)/((c1/2)+DELTA);//68
		lp1=lt+2*DELTA;//71
		l0=(lt1+lp1)/2;//72
		Bdelta=PHIlamda/(bp*l0);
		Bt_1_3=PHIlamda/(3*q*ALPHAp*lef*bt_1_3);//74
		Bt_1_2=(Bt_1_3*bt_1_3)/bt_1_2;//75
		Bj=PHI/(2*hj*lef);//76
		
		
		//System.out.println("PHI "+PHI+","+"hj "+hj+","+"lef "+lef);
		DELTA1=DELTA+(DELTAMax-DELTA)/3;//77
		Kdelta1=(t1+10*DELTA1)/(bt+10*DELTA1);//81
		Kdelta2=(tv+10*DELTA1)/((tv-bv)+10*DELTA1);//82
		Kdelta3=(t2+10*DELTA1)/((t2-bsh)+10*DELTA1);//83
		Kdelta=Kdelta1*Kdelta2*Kdelta3;//84
		Fdelta=1.6*DELTA1*Kdelta*Bdelta;//85
		Fa=(2.12*Kdp1*WPHI*IN)/P;//86
		Kad=queryKad(diagrams,ALPHAp);//87
		//System.out.println("Kad "+Kad);
		
		Fad=Kad*Fa;//88
		Xad=Fad/Fdelta;//89
		Kq=queryK1(diagrams,deltamax_p_delta,ALPHAp)+queryK2(diagrams,delta_p_tal,ALPHAp);//90
		//System.out.println("K1 "+queryK1(diagrams,deltamax_p_delta,ALPHAp)+"K2 "+queryK2(diagrams,delta_p_tal,ALPHAp));
		Xaq=(Kq*(1+Kdelta)*Xad)/2;//91
		Xsigma=queryXsigma(c);//92
		System.out.println("Xsigma---"+Xsigma);
		Xd=Xsigma+Xad;//93
		Xq=Xsigma+Xaq;//94
		
		lm1=lm+DELTAp;//99
		
		ap=(bp-bm)/2;
		dt=hp+DELTA-(bp*bp)/(4*DI);
		cp=tal-bp-(3.14*dt)/P;
		talm=tal-bm-(3.14*(hm+2*hp+2*DELTA))/(2*P);//100
		System.out.println("ap "+ap+" dt "+dt+" cp "+cp+" talm "+talm);
		
		lamdapl=(1.4*(dt/cp-0.25))+(0.55*(ap/cp+0.2))-(0.4*((ap/cp)-0.5)*((ap/cp)-0.5));//101
		lamdaml=(0.55*hm)/talm;//102
		lamdamb=(0.37*bm)/lm1;//103
		lamdam_plus_p=lamdapl+lamdaml+lamdamb;//104
		LAMDA=lamdapl+lamdaml/1.53+lamdamb/2.65;//105
		Xsigma2=Kad*Xad*(Kphi+(2*Fdelta*lp1*LAMDA)/PHI1);//106
		System.out.println("Xsigma2---"+Xsigma2);
		Xsigmaf=Xsigma2-Xad;//107
		System.out.println("Xsigmaf---"+Xsigmaf);
		Xd1=Xd-(Xad*Xad)/Xsigma2;//108
		Xq1=Xq;//109
		Xsigmad=5.1*Fa*( (DI/(4*P))+(((1.7+2.8*hsh/bsh)*lt)/nB) )/(2*PHI1);//110
		Xsigmaq=querySigmaq(dampringtype);//111
		Xd2=queryXd2(damphere);//112
		Xq2=queryXq2(damphere);//113
		X2_0=Math.sqrt(Xd2*Xq2);//114
		X2_1=(Xd2+Xq2)/2;
		X0=queryX0(Beta);//115
		
		lE=queryLE(windingtype);//116
		lc=2*(lt+lE);//117
		R_15=((WPHI*lc*0.01)/(57*Ac*a));//118 
		R_75=(1.24*R_15);// 
		R_per=R_75*IPHI/UPHI;//119 
		Af=af*bf;//121
		lcf=queryLcf(bm);//122
		Rf_15=(2*P*Wf*lcf*0.01/(57*Af));//
		Rf_75=1.24*Rf_15;// 
		Rf_120=1.42*Rf_15;
		Rf_130=1.46*Rf_15;
		
		Rf_per=3330*Fa*Kad*Kad*lef/(FN*2*PHI1*Wf*Af);//124
		System.out.println("Rf_per "+Rf_per);
		
		CB=queryCBCR(dampmate);//125
		CR=queryCBCR(windingmate);
		GamaB=queryGamaBR(dampmate);//126
		GamaR=queryGamaBR(dampmate);
		
		/*AB=(0.2*3*q*NS*Ac)/nB;//(3.14*dB*dB)/4;zunitiaojiemianji
		dB=querydB( 1.13*Math.sqrt(AB) );//;
*/		
		
		AB=3.14*dB*dB/4;
		//System.out.println("AB "+AB+"dB "+dB);
		
		RDd_per=355*Fa*((CB*lB)/(nB*(AB/100))+(0.2*DI*CR)/(P*AR))/(FN*2*PHI1);//134
		RDq_per=queryRDq_per(isdamperlink);//135
		
		System.out.println("RDd_per"+RDd_per*ZM);
		System.out.println("RDq_per"+RDq_per*ZM);
		
		Td01=((Xsigmaf/ZM)+(Xad/ZM))/(2*3.14*FN*Rf_per);//136
		TDd01=((Xad/ZM)+(Xsigmad/ZM))/(2*3.14*FN*RDd_per);//137
		TDq01=((Xsigmaq/ZM)+(Xaq/ZM))/(2*3.14*FN*RDq_per);//138
		Td1=Td01*(Xd1/ZM)/(Xd/ZM);//139
		Td02=((Xsigmaq/ZM)*(Xsigmaf/ZM)+(Xad/ZM)*(Xsigmad/ZM)+(Xsigmaf/ZM)*(Xad/ZM))/(2*3.14*FN*RDd_per*((Xsigmaf/ZM)+(Xad/ZM)));//140
		Td2=Td02*(Xd2/ZM)/(Xd1/ZM);//141
		Tq2=TDq01*(Xq2/ZM)/(Xq/ZM);//142
		Ta=(X2_0/ZM)/(2*3.14*FN*R_75/ZM);//143
		Td31=Td01*(Xd1/ZM)/(Xd/ZM);//144
		Td32=Td02*(Xd2/ZM)/(Xd1/ZM);//145
		Ta3=2*(Xd2/ZM)*(Xq2/ZM)/(2*3.14*FN*(R_75/ZM)*(Xd2/ZM+Xq2/ZM));//146
		Td21=Td01*(Xd1/ZM+X2_0/ZM)/(Xd/ZM+X2_0/ZM);//147
		Td22=Td02*(Xd2/ZM+X2_0/ZM)/(Xd1/ZM+X2_0/ZM);//148
		Ta2=Math.sqrt((Xd2/ZM)*(Xq2/ZM))/(2*3.14*FN*R_75/ZM);//149
		Td11=Td01*((Xd1/ZM)+(X2_0/ZM)+(X0/ZM))/((Xd/ZM)+(X2_0/ZM)+(X0/ZM));//150 ��X0�� ����Xp
		Td12=Td02*((Xd2/ZM)+(X2_0/ZM)+(X0/ZM))/((Xd1/ZM)+(X2_0/ZM)+(X0/ZM));//151
		Ta1=queryTa1(ZM);//152
		GFei=queryGFei(tables,Si_Fe_mate);//153
		System.out.println("GFei "+GFei);
		//System.out.println("����Bj "+Bj);
		//System.out.println("����1/3 "+Bt_1_3);
		//System.out.println("����1/2 "+Bt_1_2);
		GFej=queryGFej(tables,Si_Fe_mate);//154
		
		Kr=queryKr();//155
		Ks=queryKs();//156
		KF=queryKF();//157
		PFei=queryPFei(diagrams,Bt_1_2);//158
		PFej=queryPFej(diagrams,Bj);//159
		B3=queryB3(diagrams,ALPHAp,deltamax_p_delta,delta_p_tal);//160
		Pt3=queryPt3(diagrams,B3);//161
		W1=(PFei+PFej+Pt3)*1000/(3.14*DI*l);//162
		W2_A=A*J*KF/(3800);//163
		W2_B=A*J*KF/(4000);
		W3=W2_A*t1/(2*(bs+hs-hk));//164
		SITAFe=querySITAFe(diagrams,lt/tal,vN);//165
		SITAi=W3*deltai/0.0016;//166
		SITAE=querySITAE(diagrams,tal,vN);//167
		SITAmax=SITAFe+SITAi;//168
		SITACu=(   2*l*SITAmax+(lc-2*l)*(SITAi+SITAE) )/lc;//169
		Fi=queryFi(diagrams,Bt_1_3);//170
		Fj=queryFj(diagrams,Bj);//171
		sigmam=1+( 2*lamdam_plus_p*(Fdelta+Fj+Fi)*lm1 )/PHI;//172
		PHIm=sigmam*PHI;//173
		Ap=queryAp();//174
		Am=queryAm();//175
		Bm=PHIm/Am;//176
		sigmap=1+((sigmam-1)*lamdapl)/lamdam_plus_p;//177
		PHIp=sigmap*PHI;//178
		Bp=PHIp/Am;//179
		Bm_1_2=Bp+(3*(Bm-Bp))/4;//180
		Fm=queryFm(diagrams, Bm, Bm_1_2, Bp);//181
		Fj2=0.05*Bm;//182
		Ff0=Fdelta+Fj+Fi+Fm+Fj2;//183  speat
		Fk=Fad+Xsigma*Fdelta;//184
		Kc=Ff0/Fk;//185
		Xsigmat=Xsigma+Fa*(Kad-1)/Fdelta;//186
		
		PHI1_cosphi0=PHI*(1+Xsigma);//187
		Bdelta1_cosphi0=Bdelta*(1+Xsigma);//188
		Fdelta1_cosphi0=1.6*Kdelta*DELTA1*Bdelta1_cosphi0;//189
		Bj1_cosphi0=Bj*(1+Xsigma);//190
		Fj1_cosphi0=queryFji_cosphi0(diagrams,Bj1_cosphi0);//191
		Bt_1_3_cosphi0=Bt_1_3*(1+Xsigma);//192
		Ft_1_3_cosphi0=queryFt_1_3_cosphi0(diagrams,Bt_1_3_cosphi0);//193
		sigmam1_cosphi0=1+(2*lamdam_plus_p*lm1*(Fdelta1_cosphi0+Fj1_cosphi0+Ft_1_3_cosphi0+Fad))/PHI1_cosphi0;//194 Ft1_cosphi0=Ft_1_3_cosphi0
		sigmap1_cosphi0=1+((sigmam1_cosphi0-1)*lamdapl)/lamdam_plus_p;//195
		Bm1_cosphi0=(sigmam1_cosphi0*PHI1_cosphi0+(Xsigmat-Xsigma)*PHI)/Am;//196
		Bp1_cosphi0=(sigmap1_cosphi0*PHI1_cosphi0+(Xsigmat-Xsigma)*PHI)/Am;//197
		Bm_1_2cosphi0=Bp1_cosphi0+(3*(Bm1_cosphi0-Bp1_cosphi0))/4;//198
		Fm1_cosphi0=queryFm_cosphi0(diagrams,Bm1_cosphi0,Bp1_cosphi0,Bm_1_2cosphi0);
		Fj21_cosphi0=0.05*Bm1_cosphi0;//200
		EpsilonF=Fdelta1_cosphi0+Fj1_cosphi0+Ft_1_3_cosphi0+Fm1_cosphi0+Fj21_cosphi0+Fad;//201
		
		Ffn=queryFfn(diagrams,COSPHIN);//202
		
		If0=Ff0/(2*Wf);//203
		Ifn=Ffn/(2*Wf);//204
		System.out.println("Ifn--"+12.5*Ifn);
		Jf=Ifn/Af;//205
		Uf0=If0*Rf_15;//206
		Ufn_A=Ifn*Rf_120;//207
		Ufn_B=Ifn*Rf_130;
		DELTAUf=queryDELTAUf(Ufn_A);//208
		
		soultDCGenerator();
		
		//W21_A=((bf/10)*Jf*Jf)/420;//215
		//W21_B=((bf/10)*Jf*Jf)/390;
		W21_A=((bf)*Jf*Jf)/420;//215
		A2=Ffn/(2*h2);//216
		//W21_B=((bf)*Jf*Jf)/390;
		W21_B=(A2*Jf)/4000;
		
		W2=queryW2(diagrams,vN,lt_per_tal);//217
		SITAf=W21_B/W2;//218
		Adelta1=queryAdelta1();//220
		PFep0=queryPFep0();//221
		PFe=PFej+PFei+PFep0;//222
		Pcu=3*IPHI*IPHI*R_75*0.001;//223
		Pcu3=queryPcu3();//224 
		Ppl=queryPpl(diagrams,DELTAMax/DELTA);//225
		double lamdas=0.5*(1-(0.64*tal*Beta)/lE);//226 bujisuande
		Pkv=queryPkv(diagrams,Kp1);//226
		Psigmad=queryPsigmad(diagrams,lamdas*tal,A);//227 -----------
		Pk=Pcu+Pcu3+Ppl+Pkv+Psigmad+Pt3;//228
		Pcuf=(Ifn*Ifn*Rf_75+2*Ifn)*0.001;//229
		Pfv=queryPfv(vN);//230
		Pmcc=Pfv+498;//233
		EPSILONP=PFe+Pk+Pcuf+Pmcc;//234
		Eta=( 1-(EPSILONP/(PN+EPSILONP)) );//235
		GFe = GFei+GFej;//236
		Gcu = queryGcu();//237
		Gcuf=queryCcuf();//238--------------
		GB=2*P*nB*(AB/100)*lB*GamaB*0.001;//239
		GR=2*3.14*DR*AR*GamaR*0.001;//240
		Gcut=Gcu+Gcuf+GB+GR;//241
		gFe=GFe/SN;//242
		gCu=Gcut/SN;//243
		Cliyong=(SN*1000000)/(DI*DI*lt*NN);//244
		CA=1/Cliyong;//245
		
		
		getSloutionData();
		
	}
	
	
	//�������������
	private static void getSloutionData(){
		
		System.out.println("����� PN�� "+Main.PN);
		System.out.println("��������� COSPHIN�� "+Main.COSPHIN);
		System.out.println("����� SN�� "+Main.SN);
		System.out.println("���ѹ UPHI�� "+Main.UPHI);
		System.out.println("����� IN�� "+Main.IN);
		System.out.println("����� IPHI�� "+Main.IPHI);
		System.out.println("�ת�� NN�� "+Main.NN);
		System.out.println("����ת�� NR�� "+Main.NR);
		System.out.println("�Ƶ�� FN�� "+Main.FN);
		System.out.println("������ P�� "+Main.P);
		System.out.println("���� M�� "+Main.M);
		System.out.println("������о�⾶ D1�� "+Main.D1);
		System.out.println("������о�ھ� DI�� "+Main.DI);
		System.out.println("���Ӳ��� Z�� "+Main.Z);
		System.out.println("ÿ��û����� q�� "+Main.q);
		System.out.println("ÿ�ಢ��֧·�� a�� "+Main.a);
		System.out.println("ÿ����Ч������ NS�� "+Main.NS);
		System.out.println("ÿ֧·���� IA�� "+Main.IA);
		System.out.println("���Ӳ۵��� IS�� "+Main.IS);
		System.out.println("���ӳݶ����ݾ� t1�� "+Main.t1);
		System.out.println("���� tal�� "+Main.tal);
		System.out.println("�縺�� A�� "+Main.A);
		System.out.println("����ϳɽھ� Y�� "+Main.Y);
		System.out.println("�����һ�ھ� Y1�� "+Main.Y1);
		System.out.println("ÿ�മ������ WPHI�� "+Main.WPHI);
		System.out.println("������ͨ PHI1�� "+Main.PHI1);
		System.out.println("��϶ DELTA�� "+Main.DELTA);
		System.out.println("��ѥ��� bp�� "+Main.bp);
		System.out.println("����ϵ�� ALPHAp�� "+Main.ALPHAp);
		System.out.println("���ض��ѹʱ��ÿ����ͨ PHI�� "+Main.PHI);
		System.out.println("���ض��ѹʱ��ѥ���ֵĴ�ͨ PHIlamda�� "+Main.PHIlamda);
		System.out.println("ÿ֧·��Ч�������� Ac�� "+Main.Ac);
		System.out.println("��������ĵ����ܶ� J�� "+Main.J);
		System.out.println("���Ӳۿ�� bs�� "+Main.bs);
		System.out.println("���Ӳ۸߶� hs�� "+Main.hs);
		System.out.println("���Ӳ�Ш�߶� hk�� "+Main.hk);
		System.out.println("������Ȧ��Ե���ߺ��deltai�� "+Main.deltai);
		System.out.println("������о�ܳ��� lt�� "+Main.lt);
		System.out.println("������о��Ե�ν����θ߶� a1�� "+Main.a1);
		System.out.println("������о��Ե�ν����ο�� c1�� "+Main.c1);
		System.out.println("������о���㳤�� lt1�� "+Main.lt1);
		System.out.println("������ѥ���� lp�� "+Main.lp);
		System.out.println("���������� lm�� "+Main.lm);
		System.out.println("��·�� Kc�� "+Main.Kc);
		System.out.println("��ѥ����϶��ƽ����ͨ�ܶ� Bdelta�� "+Main.Bdelta);
		System.out.println("����1/3�ݸߴ���ͨ�ܶ� Bt_1_3�� "+Main.Bt_1_3);
		System.out.println("����1/2�ݸߴ���ͨ�ܶ� Bt_1_2�� "+Main.Bt_1_2);
		System.out.println("������Ĵ�ͨ�ܶ� Bj�� "+Main.Bj);
		System.out.println("�������ھ� t2�� "+Main.t2);
		System.out.println("��������ۿ��ڿ�� bsh�� "+Main.bsh);
		System.out.println("��������ۿ��ڸø߶� hsh�� "+Main.hsh);
		System.out.println("��϶��λ�� Fdelta�� "+Main.Fdelta);
		System.out.println("����������β��Ŷ��� Fa�� "+Main.Fa);
		System.out.println("����������෴Ӧֱ��Ŷ��� Fad�� "+Main.Fad);
		
		
		
		System.out.println("ֱ����෴Ӧ�翹 Xad�� "+Main.Xad);
		System.out.println("������෴Ӧ�翹 Xaq�� "+Main.Xaq);
		System.out.println("��������©�� Xsigma�� "+Main.Xsigma);
		System.out.println("ֱ��ͬ���翹 Xd�� "+Main.Xd);
		System.out.println("����ͬ���翹 Xq�� "+Main.Xq);
		System.out.println("��ѥ�߶� hp�� "+Main.hp);
		System.out.println("������ bm�� "+Main.bm);
		System.out.println("����߶� hm�� "+Main.hm);
		System.out.println("�ż�ѹ���� DELTAp�� "+Main.DELTAp);
		System.out.println("��������ֱ��©�� Xsigmad�� "+Main.Xsigmad);
		System.out.println("�������齻��©�� Xsigmaq�� "+Main.Xsigmaq);
		System.out.println("ֱ�ᳬ˲��翹 Xd2�� "+Main.Xd2);
		System.out.println("���ᳬ˲��翹 Xq2�� "+Main.Xq2);
		System.out.println("����翹 X2_0�� "+Main.X2_0);
		System.out.println("����翹 X0�� "+Main.X0);
		System.out.println("����������� R_15�� "+Main.R_15);
		System.out.println("R_75�� "+Main.R_75);
		System.out.println("R_per�� "+Main.R_per);
		System.out.println("��������ͭ�ߺ�� af�� "+Main.af);
		System.out.println("��������ͭ�߿�� bf�� "+Main.bf);
		System.out.println("��������ÿ������ Wf�� "+Main.Wf);
		System.out.println("����������� Rf_15�� "+Main.Rf_15);
		System.out.println("Rf_75�� "+Main.Rf_75);
		System.out.println("Rf_120�� "+Main.Rf_120);
		System.out.println("Rf_130�� "+Main.Rf_130);
		System.out.println("Rf_per�� "+Main.Rf_per);
		System.out.println("ÿ���������� nB�� "+Main.nB);
		System.out.println("������ֱ�� dB�� "+Main.dB);
		System.out.println("����������� AB�� "+Main.AB);
		System.out.println("���������� lB�� "+Main.lB);
		System.out.println("���ỷ��� aR�� "+Main.aR);
		System.out.println("���ỷ��� bR�� "+Main.bR);
		System.out.println("���ỷ����� AR�� "+Main.AR);
		System.out.println("���ỷƽ��ֱ�� DR�� "+Main.DR);
		System.out.println("ֱ������������� RDd_per�� "+Main.RDd_per);
		System.out.println("�������鿪·ʱ���������ʱ�䳣�� Td01�� "+Main.Td01);
		System.out.println("����������������鿪·ʱֱ�����������ʱ�䳣�� TDd01�� "+Main.TDd01);
		System.out.println("�������鿪·ʱ�������������ʱ�䳣�� TDq01�� "+Main.TDq01);
		System.out.println("���������·ʱ���������ʱ�䳣�� Td1�� "+Main.Td1);
		System.out.println("�������鼰���������·ʱֱ�����������ʱ�䳣�� Td2�� "+Main.Td2);
		System.out.println("���������·ʱ�������������ʱ�䳣�� Tq2�� "+Main.Tq2);
		System.out.println("���������·ʱ���������ʱ�䳣�� Ta�� "+Main.Ta);
		System.out.println("���������·ʱ˲�����˥��ʱ�䳣�� Td31�� "+Main.Td31);
		System.out.println("���������·ʱ��˲�����˥��ʱ�䳣�� Td32�� "+Main.Td32);
		System.out.println("���������·ʱ���ӵ��������ڷ���˥��ʱ�䳣�� Ta3�� "+Main.Ta3);
		System.out.println("���������·ʱ˲�����˥��ʱ�䳣�� Td21�� "+Main.Td21);
		System.out.println("���������·ʱ��˲�����˥��ʱ�䳣�� Td22�� "+Main.Td22);
		System.out.println("���������·ʱ�����ڷ���˥��ʱ�䳣�� Ta2�� "+Main.Ta2);
		System.out.println("���˵����·ʱ˲�����˥��ʱ�䳣�� Td11�� "+Main.Td11);
		System.out.println("���˵����·ʱ��˲�����˥��ʱ�䳣�� Td12�� "+Main.Td12);
		System.out.println("���˵����·ʱ���ӵ��������ڷ���˥��ʱ�䳣�� Ta1�� "+Main.Ta1);
		System.out.println("���ӳ��� GFei�� "+Main.GFei);
		System.out.println("�������� GFej�� "+Main.GFej);
		System.out.println("���ض��ѹ�Ƕ��ӳ������� PFei�� "+Main.PFei);
		System.out.println("���ض��ѹ�Ƕ����������� PFej�� "+Main.PFej);
		System.out.println("��·����Ϊ�����ʱ�ų�����г���ڶ��ӳ��еĴ�ͨ�ܶ� B3�� "+Main.B3);
		System.out.println("��·����Ϊ�����ʱ�ų�������г���ڶ��ӳ�������ĸ������ Pt3�� "+Main.Pt3);
		System.out.println("�����ڶ�����Բ�����ĵ�λ�ȸ��� W1�� "+Main.W1);
		System.out.println("ͭ���ڶ�����Բ�����ĵ�λ�ȸ��� W2�� "+Main.W2_A);
		System.out.println("ͭ������Ȧ��������ĵ�λ�ȸ��� W3�� "+Main.W3);
		System.out.println("��о�Կ��������� SITAFe�� "+Main.SITAFe);
		System.out.println("��Ȧ��Ե�¶Ƚ� SITAi�� "+Main.SITAi);
		System.out.println("��Ȧ�˲�����Կ��������� SITAE�� "+Main.SITAE);
		System.out.println("������Ч���ֵ�������� SITAmax�� "+Main.SITAmax);
		System.out.println("������Ȧ�Կ�����ƽ������ SITACu�� "+Main.SITACu);
		System.out.println("���ӳݴ�λ�� Fi�� "+Main.Fi);
		System.out.println("�������λ�� Fj�� "+Main.Fj);
		System.out.println("�ż�©��ϵ�� PHIm�� "+Main.PHIm);
		System.out.println("�ż�ѹ������ Ap�� "+Main.Ap);
		System.out.println("�ż���о����� Am�� "+Main.Am);
		System.out.println("��������Ĵ�ͨ�ܶ� Bm�� "+Main.Bm);
		System.out.println("�����ϲ���©��ͨ PHIp�� "+Main.PHIp);
		System.out.println("�����ϲ��Ĵ�ͨ�ܶ� Bp�� "+Main.Bp);
		System.out.println("�ż���ƽ����ͨ�ܶ� Bm_1_2�� "+Main.Bm_1_2);
		System.out.println("�ż��Ĵ�λ�� Fm�� "+Main.Fm);
		System.out.println("ת������ż��ӷ촦��λ�� Fj2�� "+Main.Fj2);
		System.out.println("���ѹ�¿��ش�λ�� Ff0�� "+Main.Ff0);
		System.out.println("��·����Ϊ�����ʱ�Ĵ�λ��Fk�� "+Main.Fk);
		System.out.println("����������©�� Xsigmat�� "+Main.Xsigmat);
		System.out.println("cosphi=0ʱ��Ӧ���ѹUPHI��û����ͨ PHI1�� "+Main.PHI1);
		System.out.println("��϶ƽ����ͨ�ܶ� Bdelta1_cosphi0�� "+Main.Bdelta1_cosphi0);
		System.out.println("����϶�Ĵ�λ�� Fdelta1_cosphi0�� "+Main.Fdelta1_cosphi0);
		System.out.println("������Ĵ�ͨ�ܶ� Bj1_cosphi0�� "+Main.Bj1_cosphi0);
		System.out.println("������Ĵ�λ�� Fj1_cosphi0�� "+Main.Fj1_cosphi0);
		System.out.println("���ӳݵĴ�ͨ�ܶ� Bt_1_3_cosphi0�� "+Main.Bt_1_3_cosphi0);
		System.out.println("���ӳݵĴ�λ�� Ft_1_3_cosphi0�� "+Main.Ft_1_3_cosphi0);
		System.out.println("��������Ĵ�ͨ�ܶ� Bm1_cosphi0�� "+Main.Bm1_cosphi0);
		System.out.println("�����ϲ��Ĵ�ͨ�ܶ� Bp1_cosphi0�� "+Main.Bp1_cosphi0);
		System.out.println("�����ƽ����ͨ�ܶ� Bm_1_2cosphi0�� "+Main.Bm_1_2cosphi0);
		System.out.println("�ż��Ĵ�λ�� Fm1_cosphi0�� "+Main.Fm1_cosphi0);
		System.out.println("ת������ż��ӷ촦��λ�� Fj21_cosphi0�� "+Main.Fj21_cosphi0);
		System.out.println("�ǧ������cosphi=0ʱ����ʱ���ܴ�λ�� EpsilonF�� "+Main.EpsilonF);
		System.out.println("����ŴŶ��� Ffn�� "+Main.Ffn);
		System.out.println("���ض��ѹʱ���ŵ��� If0�� "+Main.If0);
		System.out.println("�����ʱ���ŵ��� Ifn�� "+Main.Ifn);
		System.out.println("�����ʱ��������ĵ����ܶ� Jf�� "+Main.Jf);
		System.out.println("����ʱ��������Ļ�����ѹ Uf0�� "+Main.Uf0);
		System.out.println("�����ʱ��������Ļ�����ѹ Ufn_A�� "+Main.Ufn_A);
		System.out.println("���绷�ϵ����ŵ�ѹ�����ٶ� DELTAUf�� "+Main.DELTAUf);
		System.out.println("��������ڴż���Ȧ���������ĵ�λ�ȸ��� W21_A�� "+Main.W21_A);
		System.out.println("ת����Ȧ�ĵ縺�� A2�� "+Main.A2);
		System.out.println("ת����Ȧ�ı���ɢ��ϵ�� W2�� "+Main.W2);
		System.out.println("ת����Ȧ�Կ��������� SITAf�� "+Main.SITAf);
		System.out.println("�ż���Ƭ��� DELTApp�� "+Main.DELTApp);
		System.out.println("��ѥ����ļ������ Adelta1�� "+Main.Adelta1);
		System.out.println("���ض��ѹʱ��ѥ����ĸ������ PFep0�� "+Main.PFep0);
		System.out.println("����ʱ������ PFe�� "+Main.PFe);
		System.out.println("�����ʱ��������ͭ�� Pcu�� "+Main.Pcu);
		System.out.println("�����ʱ˫�㶨������ĸ���ͭ�� Pcu3�� "+Main.Pcu3);
		System.out.println("��·����Ϊ�����ʱ���Ӵų��г�г���ڼ�ѥ���漰���������в����ĸ������ Ppl�� "+Main.Ppl);
		System.out.println("��·����Ϊ�����ʱ���Ӵų��иߴ�г���ڼ�ѥ���漰���������в����ĸ������  Pkv�� "+Main.Pkv);
		System.out.println("��·����Ϊ�����ʱ�ڶ��ӳ�ѹ�弰�˸��ϵĸ������ Psigmad�� "+Main.Psigmad);
		System.out.println("��·���������ʱ������� Pk�� "+Main.Pk);
		System.out.println("����أ���ѹ����������ʱ��������� Pcuf�� "+Main.Pcuf);
		System.out.println("��Ħ���  Pfv�� "+Main.Pfv);
		System.out.println("�ܻ�е��� Pmcc�� "+Main.Pmcc);
		System.out.println("����� EPSILONP�� "+Main.EPSILONP);
		System.out.println("����������ʱ��Ч�� Eta�� "+Main.Eta);
		System.out.println("�����������Ч���� GFe�� "+Main.GFe);
		System.out.println("��������ͭ�� Gcu�� "+Main.Gcu);
		System.out.println("��������ͭ�� Gcuf�� "+Main.Gcuf);
		System.out.println("���������� GB�� "+Main.GB);
		System.out.println("���㻷���� GR�� "+Main.GR);
		System.out.println("�������Чͭ���� Gcut�� "+Main.Gcut);
		System.out.println("�������λ������Ч������ gFe�� "+Main.gFe);
		System.out.println("�������λ������Чͭ���� gCu�� "+Main.gCu);
		System.out.println("�������CA�� "+Main.CA);
		System.out.println("ֱ��˲��翹Xd1�� "+Main.Xd1);
		System.out.println("����˲��翹Xq1�� "+Main.Xq1);
		
		
		
		System.out.println("Xd�� "+Main.Xd);
		System.out.println("Xq�� "+Main.Xq);
		System.out.println("Xd1�� "+Main.Xd1);
		System.out.println("Xq1�� "+Main.Xq1);
		System.out.println("Xd2�� "+Main.Xd2);
		System.out.println("Xd2�� "+Main.Xd2);
		System.out.println("PFe�� "+Main.PFe);
		System.out.println("Pk�� "+Main.Pk);
		System.out.println("Pcuf�� "+Main.Pcuf);
		System.out.println("Pmcc�� "+Main.Pmcc);
		System.out.println("EPSILONP�� "+Main.EPSILONP);
		System.out.println("SITAFe�� "+Main.SITAFe);
		System.out.println("SITAE�� "+Main.SITAE);
		System.out.println("SITAmax�� "+Main.SITAmax);
		System.out.println("SITACu�� "+Main.SITACu);
	}
	
	private static double querydB(double dB){
		if(dB>=10&&dB<14){
			return 12;
		}else if(dB>=14&&dB<17){
			return 16;
		}else if(dB>=17&&dB<19){
			return 18;
		}else if(dB>=19&&dB<21){
			return 20;
		}else if(dB>=21&&dB<23.5){
			return 22;
		}else if(dB>=23.5&&dB<26.5){
			return 25;
		}else if(dB>=26.5&&dB<30){
			return 28;
		}else{
			try {
				throw new Exception("dBzhiyouwu");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally{
				return 0;
			}
			
		}
	}
	
	private static double queryCcuf(){
		double Gamacu=GamaB;
		return 2*P*Wf*lcf*Af*Gamacu*0.00001;
	}
	
	private static double queryGcu(){
		double Gamacu=GamaB;
		return ((Z*NS*Ac*lc*Gamacu)/2)*0.00001;
	}
	
	private static double queryPfv(double vN){
		double SITAa=25;//moren 25
		return ( 0.171*(vN/10)*(vN/10)*( PFe+Pk+Pcuf ) )/( 1.1*SITAa-0.171*(vN/10)*(vN/10) );
	}
	
	private static double queryPsigmad(Diagrams diagrams,double lamdas_muti_tal,double A){
		Q2_LAMDAS_MUTI_TALLINES q2_lamdas_muti_tallines=diagrams.getQ2_lamdas_muti_tal();
		//System.out.println("A:"+A);
		
		Line lineq2_lamdas_muti_tal=q2_lamdas_muti_tallines.getLine(A);
		Point pq2_lamdas_muti_tal=new Point();
		pq2_lamdas_muti_tal.setX(lamdas_muti_tal);
		MyMath.Newton(lineq2_lamdas_muti_tal.getArray(), pq2_lamdas_muti_tal);
		double q2=pq2_lamdas_muti_tal.getY();
		return 3.5*tal*DI*q2*Math.pow(FN/50, 1.5)*0.001;
	}
	
	private static double queryPkv(Diagrams diagrams,double Kp){
		double DELTAB=(5*t2*3.14)/tal;//huduzhi
		double lamdas=0.5*(1-(0.64*tal*Beta)/lE);
		double lamdadelta=(t2-bsh)/(Kdelta*DELTA1);
		double Kf300=1.96*(dB/10)*Math.sqrt(1/CB);
		KSIGMA_KPLINES ksigma_kplines=diagrams.getKsigma_kplines();
		Line lineksigma_kp=ksigma_kplines.getLine();
		Point pksigma_kp=new Point();
		pksigma_kp.setX(Kp);
		MyMath.Newton(lineksigma_kp.getArray(), pksigma_kp);
		double Ksigma=pksigma_kp.getY();
		
		return (3.7*P*nB*lB*CB*Kf300/(AB/100))*(tal/(DELTA*Kdelta))*(tal/(DELTA*Kdelta))*( (Ksigma*Xad*Fdelta/2000)/(lamdadelta/(1-Math.cos(DELTAB))+2*lamdas) )*( (Ksigma*Xad*Fdelta/2000)/(lamdadelta/(1-Math.cos(DELTAB))+2*lamdas) )*0.00001;
		
	}
	
	private static double queryPpl(Diagrams diagrams,double deltamax_per_delta){
		K1_DELTAMAX_PER_DELTALINES k1_deltamax_per_deltalines=diagrams.getK1_deltamax_per_deltalines();
		Line line=k1_deltamax_per_deltalines.getLine();
		Point pk1_deltamax_per_delta=new Point();
		pk1_deltamax_per_delta.setX(deltamax_per_delta);
		MyMath.Newton(line.getArray(), pk1_deltamax_per_delta);
		double K1=pk1_deltamax_per_delta.getY();
		return K1*( (Xad*2*P)/(Z*(Kdelta1-1)) )*( (Xad*2*P)/(Z*(Kdelta1-1)) )*PFep0;
	}
	
	private static double queryPcu3(){
		double m=0;//157 m morenwei0
		return Pcu*(Kr*m+Ks)*(FN/50)*(FN/50);
	}
	
	private static double queryPFep0(){
		double K1=8.6;//morenjixuehoudu 2mm
		double K2=10;//morenwei zitongtiao
		return (K1+K2)*( (Kdelta1-1)*(Bdelta*t1)/1000 )*( (Kdelta1-1)*(Bdelta*t1)/1000 )*Math.pow(Z*NN/10000, 1.5)*2*P*Adelta1*0.0000001;
	}
	
	private static double queryAdelta1(){
		double lpf=a1;
		double r=0;
		double DELTAc=DELTA+c1/3;
		double sp_=Math.sqrt((lpf-r-a1)*(lpf-r-a1)+(DELTA+c1)*(DELTA+c1));
		double DELTAr=(r*DELTA+a1*DELTAc+(lpf-r-a1)*sp_)/lpf;
		if(lp>=(lt+2*DELTA)){
			return bp*(lt+2*DELTA);
		}else if(lp<(lt+2*DELTA)){
			return bp*( lp+(2*lpf*Math.pow(DELTA/DELTAr,1.5))*(0.7/DELTApp) );
		}else{
			try {
				throw new Exception("lpzhiyouwu");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally{
				return 0;
			}
			
		}
		
	}
	
	private static double queryW2(Diagrams diagrams,double vN,double lt_per_tal){
		W1_VLINES w1_vlines=diagrams.getW1_vlines();
		Line linew1_v=null;
		if(AirCool==0){
			linew1_v=w1_vlines.getLineR();
		}else{
			linew1_v=w1_vlines.getLineL();
		}
		//linew1_v=w1_vlines.getLineFore();
		Point pw1_v=new Point();
		pw1_v.setX(vN);
		MyMath.Newton(linew1_v.getArray(), pw1_v);
		double W1=pw1_v.getY();
		
		K_LT_PER_TALLINES k_lt_per_tallines=diagrams.getK_lt_per_tallines();
		Line linek_lt_per_tal=k_lt_per_tallines.getLine();
		Point pk_lt_per_tal=new Point();
		pk_lt_per_tal.setX(lt_per_tal);
		MyMath.Newton(linek_lt_per_tal.getArray(), pk_lt_per_tal);
		double K=pk_lt_per_tal.getY();
		
		return K*W1;
		
	}
	
	private static void soultDCGenerator(){
		Uf=1.1*Ufn_A;//209
		If=1.1*Ifn;//210
		System.out.println("If---"+If);
		Pf=Uf*If*0.001;//211
		Ufmax=1.8*Ufn_A;//212
		Ifmax=(Ufmax-5)/Rf_15;//213
		Pfmax=Ufmax*Ifmax*0.001;//214
			
	}
	
	private static double queryDELTAUf(double Ufn){
		/*if(SN>=0&&SN<=4000){
			return 1.3*Ufn;
		}else if(SN>4000){
			return 1.5*Ufn;
		}else{
			try {
				throw new Exception("SNzhiyouwu");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally{
				return 1.5*Ufn;
			}
		}*/
		//��ֹ����
		return 2*Ufn;
	}
	
	private static double queryFfn(Diagrams diagrams,double COSPHIN){
		K_COSPHILINES k_cosphilines=diagrams.getK_cosphilines();
		Line linek_cosphi=k_cosphilines.getLine();
		Point pk_cosphi=new Point();
		pk_cosphi.setX(COSPHIN);
		MyMath.Newton(linek_cosphi.getArray(), pk_cosphi);
		double K=pk_cosphi.getY();
		double sinphi=Math.sqrt(1-COSPHIN*COSPHIN);
		
		//�˴��򻯼���Ffn
		if(NN>=0&&NN<214){
			return 1.03*Ff0*(Math.sqrt(1+(K/Kc)*(K/Kc)+(2*K*sinphi)/Kc));
		}else{
			return 0.96*Ff0*(Math.sqrt(1+(K/Kc)*(K/Kc)+(2*K*sinphi)/Kc));
		}
		
	}
	
	private static double queryFm_cosphi0(Diagrams diagrams,double Bm1_cosphi0,double Bp1_cosphi0,double Bm_1_2cosphi0){
		F_DOWN_B f_down_blines=diagrams.getF_down_blines();
		Line lineW315_50=f_down_blines.getLineW315_50();
		Point pfm1_cosphi0_down_b=new Point();
		pfm1_cosphi0_down_b.setX(Bm1_cosphi0);
		MyMath.ToLine(lineW315_50.getArray(), pfm1_cosphi0_down_b);
		double fm1_cosphi0=pfm1_cosphi0_down_b.getY();
		
		Point pfp1_cosphi0_down_b=new Point();
		pfp1_cosphi0_down_b.setX(Bp1_cosphi0);
		MyMath.ToLine(lineW315_50.getArray(), pfp1_cosphi0_down_b);
		double fp1_cosphi0=pfp1_cosphi0_down_b.getY();
		
		Point pfm1_2_cosphi0_down_b=new Point();
		pfm1_2_cosphi0_down_b.setX(Bm_1_2cosphi0);
		MyMath.ToLine(lineW315_50.getArray(), pfm1_2_cosphi0_down_b);
		double fm1_2_cosphi0=pfm1_2_cosphi0_down_b.getY();
		
		return ((hp+hm)*(fm1_cosphi0+fp1_cosphi0+4*fm1_2_cosphi0))/3;
	}
	
	private static double queryFt_1_3_cosphi0(Diagrams diagrams,double Bt_1_3_cosphi0){
		F_DOWN_B f_down_blines=diagrams.getF_down_blines();
		Line lineW315_50=f_down_blines.getLineW315_50();
		Point pft_1_3_cosphi0_down_b=new Point();
		pft_1_3_cosphi0_down_b.setX(Bt_1_3_cosphi0);
		MyMath.ToLine(lineW315_50.getArray(), pft_1_3_cosphi0_down_b);
		double ft_1_3_cosphi0=pft_1_3_cosphi0_down_b.getY();
		
		return 2*hs*ft_1_3_cosphi0;
		
		
	}
	
	private static double queryFji_cosphi0(Diagrams diagrams,double Bj1_cosphi0){
		F_DOWN_B f_down_blines=diagrams.getF_down_blines();
		Line lineW315_50=f_down_blines.getLineW315_50();
		Point pfj1_cosphi0_down_b=new Point();
		pfj1_cosphi0_down_b.setX(Bj1_cosphi0);
		MyMath.ToLine(lineW315_50.getArray(), pfj1_cosphi0_down_b);
		double fj1_cosphi0=pfj1_cosphi0_down_b.getY();
		
		return Lj*fj1_cosphi0;
	}
	
	private static double queryFm(Diagrams diagrams,double Bm,double Bm_1_2,double Bp){
		F_DOWN_B f_down_blines=diagrams.getF_down_blines();
		Line lineW315_50=f_down_blines.getLineW315_50();
		Point pfm_down_b=new Point();
		pfm_down_b.setX(Bm);
		MyMath.ToLine(lineW315_50.getArray(), pfm_down_b);
		double fm=pfm_down_b.getY();
		
		Point pfm_1_2_down_b=new Point();
		pfm_1_2_down_b.setX(Bm_1_2);
		MyMath.ToLine(lineW315_50.getArray(), pfm_1_2_down_b);
		double fm_1_2=pfm_1_2_down_b.getY();
		
		Point pfp_down_b=new Point();
		pfp_down_b.setX(Bp);
		MyMath.ToLine(lineW315_50.getArray(), pfp_down_b);
		double fp=pfp_down_b.getY();
		
		if(Bm<=16000){
			return 2*(hp+hm)*fm;
		}else{
			return ((hp+hm)*(fm+4*fm_1_2+fp))/3;
		}
		
		
	}
	
	private static double queryAm(){
		//�����1mmһ�¸ְ���ɴż�
		
		return 0.95*lm*bm+2*Ap;
		//1.5mm-2.0mm
		//return 0.97*lm*bm+2*Ap;
	}
	
	private static double queryAp(){
		//ֻ����Բͷ������Ȧ
		return 0.5*bm*DELTAp;
	}
	
	private static double queryFj(Diagrams diagrams,double Bj){
		F_DOWN_B f_down_blines=diagrams.getF_down_blines();
		Line lineW315_50=f_down_blines.getLineW315_50();
		Point pf_down_b=new Point();
		pf_down_b.setX(Bj);
		MyMath.ToLine(lineW315_50.getArray(), pf_down_b);
		
		double fj=pf_down_b.getY();
		return Lj*fj;
		
	}
	
	private static double queryFi(Diagrams diagrams,double Bt_1_3){
		F_DOWN_B f_down_blines=diagrams.getF_down_blines();
		Line lineW315_50=f_down_blines.getLineW315_50();
		Point pf_down_b=new Point();
		pf_down_b.setX(Bt_1_3);
		MyMath.ToLine(lineW315_50.getArray(), pf_down_b);
		double ft_1_3=pf_down_b.getY();
		
		return 2*hs*ft_1_3;
	}
	
	private static double querySITAE(Diagrams diagrams,double tal,double vN){
		
		CS_TALLINES cs_tallines=diagrams.getCs_tallines();
		Line line=cs_tallines.getLine();
		Point pcs_tal=new Point();
		pcs_tal.setX(tal);
		MyMath.Newton(line.getArray(), pcs_tal);
		
		return (W3*pcs_tal.getY())/(1+0.047*vN);
	}
	
	private static double querySITAFe(Diagrams diagrams,double lt_p_tal,double vN){
		CFE_LT_PER_TALLINES cfe_lt_per_tallines=diagrams.getCfe_lt_per_tallines();
		Line line=cfe_lt_per_tallines.getLine();
		Point pcfe_lt_per_tal=new Point();
		pcfe_lt_per_tal.setX(lt_p_tal);
		MyMath.Newton(line.getArray(), pcfe_lt_per_tal);
		
		return ((W1+W2_A)*pcfe_lt_per_tal.getY())/(1+0.0666*vN);
	}
	
	private static double queryPt3(Diagrams diagrams,double B3){
		FE_LOSE_B fe_lose_blines=diagrams.getFe_lose_blines();
		Line lineW315_50=fe_lose_blines.getLineW315_50();
		Point p_fe_lose_b=new Point();
		p_fe_lose_b.setX(B3);
		MyMath.ToLine(lineW315_50.getArray(), p_fe_lose_b);
		
		double PFe10_50=p_fe_lose_b.getY();
		if(B3>=4000&&B3<5000){
			PFe10_50=0.25;//B3����������2000Gs �Զ��嵥λ���0.003
		}else if(B3>=3000&&B3<4000){
			PFe10_50=0.1;
		}else if(B3>=2000&&B3<3000){
			PFe10_50=0.05;
		}else if(B3>=1000&&B3<2000){
			PFe10_50=0.03;
		}else if(B3>=0&&B3<1000){
			PFe10_50=0.01;
		}else{
			PFe10_50=p_fe_lose_b.getY();
		}
		
		return 10.7*GFei*PFe10_50*Math.pow((B3/10000), 1.25)*0.001;
	}
	
	private static double queryB3(Diagrams diagrams,double ALPHAp,double deltamax_p_delta,double delta_p_tal){
		A1_70_DELTA_PER_TALLINES a1_70_delta_per_tallines=diagrams.getA1_70_delta_per_tallines();
		Line linealphap=a1_70_delta_per_tallines.getLine(ALPHAp);
		Point pa1_70_delta_per_tal=new Point();
		pa1_70_delta_per_tal.setX(delta_p_tal);
		MyMath.Newton(linealphap.getArray(), pa1_70_delta_per_tal);
		
		B1_160_DELTA_PER_TALLINES b1_160_delta_per_tallines=diagrams.getB1_160_delta_per_tallines();
		Line linedeltamax_p_tal=b1_160_delta_per_tallines.getLine(deltamax_p_delta);
		Point pb1_160_delta_per_tal=new Point();
		pb1_160_delta_per_tal.setX(delta_p_tal);
		MyMath.Newton(linedeltamax_p_tal.getArray(), pb1_160_delta_per_tal);
		
		A1_71_ALPHAPLINES a1_71_alphaplines=diagrams.getA1_71_alphaplines();
		Line a1linedeltamax_p_delta=a1_71_alphaplines.getLine(deltamax_p_delta);
		Point pa1_71_alphap=new Point();
		pa1_71_alphap.setX(ALPHAp);
		MyMath.Newton(a1linedeltamax_p_delta.getArray(), pa1_71_alphap);
		
		A2_71_DELTALINES a2_71_deltalines=diagrams.getA2_71_deltalines();
		Line a2linedeltamax_p_delta=a2_71_deltalines.getLine(deltamax_p_delta);
		Point pa2_71_delta=new Point();
		pa2_71_delta.setX(0.035);
		MyMath.Newton(a2linedeltamax_p_delta.getArray(), pa2_71_delta);
		
		double a3=pa1_70_delta_per_tal.getY()*pb1_160_delta_per_tal.getY()-0.7;
		double Ad3=pa1_71_alphap.getY()*pa2_71_delta.getY();
		
		return Bt_1_2*(a3*Xd+1.27*Xad*Ad3);
	}
	
	private static double queryPFej(Diagrams diagrams,double Bj){
		double kd1=1.5;
		if(SN>=0&&SN<100){
			kd1=1.5;
		}else{
			kd1=1.3;
		}
		
		FE_LOSE_B fe_lose_blines=diagrams.getFe_lose_blines();
		Line lineW315_50=fe_lose_blines.getLineW315_50();
		Point p_fe_lose_b=new Point();
		p_fe_lose_b.setX(Bj);
		MyMath.ToLine(lineW315_50.getArray(), p_fe_lose_b);
		
		double PFe10_50=p_fe_lose_b.getY();
		return kd1*GFej*PFe10_50*(Bj/10000)*(Bj/10000)*Math.pow(FN/50, 1.3)*0.001;
	}
	
	private static double queryPFei(Diagrams diagrams,double Bt_1_2){
		double kd1=0.7;
		/*double kd1=2;
		if(SN>=0&&SN<100){
			kd1=2;
		}else{
			kd1=1.7;
		}*/
		
		FE_LOSE_B fe_lose_blines=diagrams.getFe_lose_blines();
		Line lineW315_50=fe_lose_blines.getLineW315_50();
		Point p_fe_lose_b=new Point();
		p_fe_lose_b.setX(Bt_1_2);
		MyMath.ToLine(lineW315_50.getArray(), p_fe_lose_b);
		
		double PFe10_50=p_fe_lose_b.getY();
		return kd1*GFei*PFe10_50*(Bt_1_2/10000)*(Bt_1_2/10000)*Math.pow(FN/50, 1.3)*0.001;
	}
	
	private static double queryKF(){
		double m=0;//m�ܻ�λӰ��
		return 1+(Kr*m+Ks)*(FN/50)*(FN/50);
		
		
	}
	
	private static double queryKs(){
		double epsilon=(2*lt-nv*bv)/lc;
		double c=2*_C;//c���Ӳ۸߷�����߸���
		return 0.107*epsilon*((2*_b)/(10*bs))*((2*_b)/(10*bs))*(c*_a)*(c*_a)*_a*_a*0.0001;
		
	}
	
	private static double queryKr(){
		double epsilon=(2*lt-nv*bv)/lc;
		double c=_C;//c���Ӳ۸߷�����߸���
		
		return (0.019*epsilon*epsilon*((2*_b)/(10*bs))*((2*_b)/(10*bs))*(c*_a)*(c*_a)*(c*_a)*(c*_a)*0.0001)/(NS*NS);
	}
	
	private static double queryGFej(Tables tables,String Si_Fe_mate){
		ArrayList<GAMA_MATE> gama_mate_list=tables.getGama_mate_list();
		Iterator it=gama_mate_list.iterator();
		GAMA_MATE gama_mate=null;
		while(it.hasNext()){
			GAMA_MATE gama_mate_next=(GAMA_MATE) it.next();
			if(gama_mate_next.getId().equals(Si_Fe_mate)){
				gama_mate=gama_mate_next;
			}
		}
		if(gama_mate!=null){
			return 2*P*Lj*(hj+0.5)*lef*gama_mate.getGama()*0.001;
		}else{
			try {
				throw new Exception("wuciguigangpiancailiao");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally{
				return 2*P*Lj*(hj+0.5)*lef*7.60*0.001;//morenwei Wx
			}
		}
		
	}
	
	private static double queryGFei(Tables tables,String Si_Fe_mate){
		ArrayList<GAMA_MATE> gama_mate_list=tables.getGama_mate_list();
		Iterator it=gama_mate_list.iterator();
		GAMA_MATE gama_mate=null;
		while(it.hasNext()){
			GAMA_MATE gama_mate_next=(GAMA_MATE) it.next();
			if(gama_mate_next.getId().equals(Si_Fe_mate)){
				gama_mate=gama_mate_next;
			}
		}
		if(gama_mate!=null){
			return Z*hs*lef*bt_1_2*gama_mate.getGama()*0.001;
		}else{
			try {
				throw new Exception("wuciguigangpiancailiao");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally{
				return Z*hs*lef*bt_1_2*7.60*0.001;//morenwei Wx
			}
		}
		
	}
	
	private static double queryTa1(double ZM){
		double R0_per=0.002;//(R_75/ZM)+0;Rg_per=0
		double X2_per=Math.sqrt(  ((Xd2/ZM)+X0/(2*ZM))*((Xq2/ZM)+X0/(2*ZM))  )-X0/(2*ZM);
		
		//return (  (2*X2_per/ZM+X0/ZM)/((2*R_75)/ZM+R0_per)  )/(2*3.14*FN); //2016.5.13xiugai
		return (  (2*X2_per+X0/ZM)/((2*R_75)/ZM+R0_per)  )/(2*3.14*FN);
	}
	
	private static double queryRDq_per(int isdamperlink){
		if(isdamperlink==1){
			return (  266*Fa*( (CB*lB)/(nB*(AB/100))+(0.4*DI*CB)/(P*(AB/100)) )/(FN*2*PHI1)  );
		}else if(isdamperlink==0){
			return (  815*Fa*( (CB*lB)/(nB*(AB/100))+(0.1*DI*CB)/(P*(AB/100)) )/(FN*2*PHI1)  );
		}else{
			try {
				throw new Exception("zunihuocailiaocuowu");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally{
				return (  266*Fa*( (CB*lB)/(nB*(AB/100))+(0.4*DI*CB)/(P*(AB/100)) )/(FN*2*PHI1)  );
			}
		}
		
		
	}
	
	private static double queryGamaBR(int damporwindingmate){
		if(damporwindingmate==0){
			return 8.9;
		}else if(damporwindingmate==1){
			return 8.5;
		}else if(damporwindingmate==2){
			return 8.5;
		}else if(damporwindingmate==3){
			return 8.5;
		}else{
			try {
				throw new Exception("zunihuocailiaocuowu");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally{
				return 8.9;
			}
		}
		
	}
	
	private static double queryCBCR(int damporwindingmate){
		if(damporwindingmate==0){
			return 1.0;
		}else if(damporwindingmate==1){
			return 3.7;
		}else if(damporwindingmate==2){
			return 8.0;
		}else if(damporwindingmate==3){
			return 10.5;
		}else if(damporwindingmate==4){
			return 8.8;
		}else{
			try {
				throw new Exception("zunihuoxianquancailiaocuowu");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally{
				return 1.0;
			}
		}
		
	}
	
	/*ֻ����Բͷ��Ȧ���㣬ƽͷ��Ȧ������*/
	private static double queryLcf(double bm){
		double delta3=0.6;
		double delta2=1.0;
		/*if(bm<6&&bm>=0){
			delta2=1.0; 
		}else if(bm>=6&&bm<=10){
			delta2=1.25;
		}else if(bm>=10.1&&bm<=12){
			delta2=1.5;
		}else if(bm>=12.1&&bm<15){
			delta2=2.0;
		}else if(bm>=15.1&&bm<=20){
			delta2=3.0;
		}else if(bm>=21){//û������bm=54
			delta2=5.0;
		}else{
			try {
				throw new Exception("bmzhiwu");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				
			}finally{
				//System.out.println("bm:"+bm);
			}
		}*/
		
		return (2*(lm-2*delta2)+3.14*(bm+2*delta3+0.1*(bf/10)));
		
		
	}
	
	private static double queryLE(int windingtype){
		//UN��kV��
		if(windingtype==1){
			return ((4*UN)/1000+1.25*tal*Beta);
		}else if(windingtype==0){
			return ((4*UN)/1000+1.25*tal);
		}else{
			try {
				throw new Exception("wuciraozuxingshi");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally{
				return (4*UN+1.25*tal);
			}
		}
		
	}
	
	private static double queryX0(double Beta){
		if(Beta>=(2/3)&&Beta<=1){
			return (  (8.3*lt*Fa)*( (Beta-0.555)*hs/bs+(3*Beta-2)*hk/bs )/(3*q*Kp1*Kp1*2*PHI1)
					+(0.45*Fa*(3*Beta-2))*( (1/(3*q))*(1/(3*q))+0.39*(Beta-2/3)-(Beta-2/3)*(Beta-2/3)+1/27 )/(Fdelta*Kp1*Kp1)  );
		}else if(Beta>=(1/3)&&Beta<(2/3)){
			double h=hs-hk;
			return (  (8.3*lt*Fa)*( (0.78-Beta)*hs/bs+(3.33-5*Beta)*hk/bs )/(3*q*Kp1*Kp1*2*PHI1)
					+(0.45*Fa*(2-3*Beta))*( (1/(3*q))*(1/(3*q))+(0.33-Beta/2)-(2/3-h)*(2/3-h) )/(Fdelta*Kp1*Kp1)  );
		}else{
			try {
				throw new Exception("Betazhiyouwu");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally{
				return (  (8.3*lt*Fa)*( (Beta-0.555)*hs/bs+(3*Beta-2)*hk/bs )/(3*q*Kp1*Kp1*2*PHI1)
						+(0.45*Fa*(3*Beta-2))*( (1/(3*q))*(1/(3*q))+0.39*(Beta-2/3)-(Beta-2/3)*(Beta-2/3)+1/27 )/(Fdelta*Kp1*Kp1)  ); 
			}
		}
		
		
	}
	
	private static double queryXq2(int damphere){
		if(damphere==1){
			return (Xsigma+(Xaq*Xsigmaq)/(Xaq+Xsigmaq));
		}else if(damphere==0){
			return Xd1;
		}else{
			try {
				throw new Exception("youwuzunixuanzecuowu");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally{
			
			
			
				return (Xsigma+(Xaq*Xsigmaq)/(Xaq+Xsigmaq));
			}
		}
	}
	
	private static double queryXd2(int damphere){
		if(damphere==1){
			return (Xsigma+(Xsigmad*(Xd1-Xsigma))/(Xsigmad+Xd1-Xsigma));
		}else if(damphere==0){
			return Xd1;
		}else{
			try {
				throw new Exception("youwuzunixuanzecuowu");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally{
				return (Xsigma+(Xsigmad*(Xd1-Xsigma))/(Xsigmad+Xd1-Xsigma));
			}
			
			
		}
	}
	
	private static double querySigmaq(int dampringtype){
		if(dampringtype==1){
			return 0.75*Xsigmad;//zhengyuan
		}else if(dampringtype==0){
			return 2*Xsigmad;//shanxing
		}else{
			try {
				throw new Exception("zunihuanleixingcuowu");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally{
				return 2*Xsigmad;
			}
		}
		
	}
	
	private static double queryXsigma(int c){
		double K=0.078;
		if(c==0){
			K=0.078;
		}else{
			K=0.156;
		}
		return   (  ((0.14*Fa)/(Kdp1*Kdp1*PHI1)) * ( (3*Beta+1)*lt*(hs+deltai+2*hk)/(bs*q) + 3.44*tal*2 )  )  +  ( K*Fa*(1/q)*(1/q) )/Fdelta  ;
	}
	
	private static double queryK2(Diagrams diagrams,double DELTA_per_TAL,double ALPHAp){
		K2_DELTA_PER_TALLINES k2_delta_per_tallines=diagrams.getK2_delta_per_tallines();
		Line linedelta_per_tal=k2_delta_per_tallines.getLine(DELTA_per_TAL);
		Point k2_delta_per_tal=new Point();
		k2_delta_per_tal.setX(ALPHAp);
		MyMath.Newton(linedelta_per_tal.getArray(), k2_delta_per_tal);
		return k2_delta_per_tal.getY();
	}
	
	private static double queryK1(Diagrams diagrams,double DELTAMax_per_DELTA,double ALPHAp){
		K1_ALPHAPLINES k1_alphalines=diagrams.getK1_alphaplines();
		Line linedeltamax_per_delta=k1_alphalines.getLine(DELTAMax_per_DELTA);
		Point k1_alpha=new Point();
		k1_alpha.setX(ALPHAp);
		MyMath.Newton(linedeltamax_per_delta.getArray(), k1_alpha);
		
		return k1_alpha.getY();
	}
	
	private static double queryKad(Diagrams diagrams,double ALPHAp){
		KAD_ALPHAPLINES kad_alphaplines=diagrams.getKad_alphaplines();
		Line kad_alphapline=kad_alphaplines.getLine();
		Point kad_alphap=new Point();
		kad_alphap.setX(ALPHAp);
		MyMath.Newton(kad_alphapline.getArray(), kad_alphap);
		return kad_alphap.getY();
	}
	
	private static double query_Acu(double _a,double _b){
		return ((_a*(_b-2*query_R(_a)))+(3.14*query_R(_a)*query_R(_a))+((_a-2*query_R(_a))*query_R(_a)*2));
	}
	
	private static double query_R(double _a){
		/*if(_a==0.90||_a==1.00){
			return 0.5*_a;
		}else if(_a==1.12||_a==1.25||_a==1.40||_a==1.60){
			return 0.5;
		}else if(_a==1.80||_a==2.00||_a==2.24){
			return 0.65;
		}else if(_a==2.50||_a==2.80||_a==3.15||_a==3.55){
			return 0.8;
		}else if(_a==4.00||_a==4.50||_a==5.00||_a==5.60){
			return 1.00;
		}else{
			try {
				throw new Exception("�޴��߹�");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally{
				return 0;
			}
		}*/
		
		return 0.65;
		
		
	}
	
	private static double queryD(Diagrams diagrams,double deltamax_p_delta,double delta_p_tal){
		D_DELTA_PER_TALLINES d_delta_per_tallines=diagrams.getD_delta_per_tallines();
		Line linedeltamax_p_delta=d_delta_per_tallines.getLine(deltamax_p_delta);
		Point d_delta_per_tal=new Point();
		d_delta_per_tal.setX(delta_p_tal);
		MyMath.Newton(linedeltamax_p_delta.getArray(), d_delta_per_tal);
		return d_delta_per_tal.getY();
		
	}
	
	private static double queryC(Diagrams diagrams,double ALPHAp,double delta_p_tal){
		C_DELTA_PER_TALLINES c_delta_per_tallines=diagrams.getC_delta_per_tallines();
		Line lineALPHAp=c_delta_per_tallines.getLine(ALPHAp);
		Point c_delta_per_tal=new Point();
		c_delta_per_tal.setX(delta_p_tal);
		MyMath.Newton(lineALPHAp.getArray(), c_delta_per_tal);
		return c_delta_per_tal.getY();
		
	}
	
	private static double queryB1(Diagrams diagrams, double deltamax_p_delta,double delta_p_tal){
		B1_41_DELTA_PER_TALLINES b1_delta_per_tallines=diagrams.getB1_41_delta_per_tallines();
		Line linedeltamax_p_delta=b1_delta_per_tallines.getLine(deltamax_p_delta);
		Point b1_delta_per_tal=new Point();
		b1_delta_per_tal.setX(delta_p_tal);
		MyMath.Newton(linedeltamax_p_delta.getArray(), b1_delta_per_tal);
		return b1_delta_per_tal.getY();
	}
	
	private static double queryB(Diagrams diagrams, double deltamax_p_delta,double ALPHAp) {
		B_BP_PER_TALLINES b_bp_per_tallines=diagrams.getB_bp_per_tallines();
		Line linedeltamax_p_delta=b_bp_per_tallines.getLine(deltamax_p_delta);
		Point b_bp_per_tal=new Point();
		b_bp_per_tal.setX(ALPHAp);
		MyMath.Newton(linedeltamax_p_delta.getArray(), b_bp_per_tal);
		return b_bp_per_tal.getY();
	}
	
	
	private static void queryQ_Beta__Y1_Kdp1_Kp1(Tables tables,int b,int c, int d) {
		ArrayList q_beta_y1_kdp1_kp1list=tables.getQ_beta_y1_kdp1_kp1list();
		Q objectQ=new Q(b,c,d/d);
		Iterator it=q_beta_y1_kdp1_kp1list.iterator();
		ArrayList querydQ_List=new ArrayList();
		while(it.hasNext()){
			Q_Beta_Y1_Kdp1_Kp1 qbykk=(Q_Beta_Y1_Kdp1_Kp1) it.next();
			Q qq=qbykk.getQ();
			                                                                     
			if(objectQ.equals(qq)){
				querydQ_List.add(qbykk);
			}
		}
		
		int i=querydQ_List.size();
		int index=(int)(Math.random()*i);
		Q_Beta_Y1_Kdp1_Kp1 q_beta_y1_kdp1_kp1=(Q_Beta_Y1_Kdp1_Kp1) querydQ_List.get(index);
		Y1=q_beta_y1_kdp1_kp1.getY1();
		Beta=q_beta_y1_kdp1_kp1.getBeta();
		Kdp1=q_beta_y1_kdp1_kp1.getKdp1();
		Kp1=q_beta_y1_kdp1_kp1.getKp1();
	}
	public static void slouteABC(int Z,int P6) {
		int gongyueshu=MyMath.gongyueshu(Z,P6);
		int z=Z/gongyueshu;
		int p6=P6/gongyueshu;
		int i=1;
		while((z-p6*i)>0){
			i++;
			
		}
		b=i-1;
		c=z-p6*(i-1);
		d=p6;
		if(c==1&&d==1){
			b=i;
			c=0;
			d=1;
		}
				
		//System.out.println(""+b+","+c+","+d); 
	}
	

	private static Scanner inputParam() {
		Scanner scanner=new Scanner(System.in);
		System.out.println("PN:");
		PN=scanner.nextDouble();
		System.out.println("COSPNIN:");
		COSPHIN=scanner.nextDouble();
		System.out.println("UN:");
		UN=scanner.nextDouble();
		System.out.println("NN:");
		NN=scanner.nextDouble();
		System.out.println("NR:");
		NR=scanner.nextDouble();
		System.out.println("NS:");
		NS=scanner.nextInt();
		System.out.println("FN:");
		FN=scanner.nextInt();
		System.out.println("M:");
		M=scanner.nextInt();
		System.out.println("D1");
		D1=scanner.nextDouble();
		System.out.println("DI:");
		DI=scanner.nextDouble();
		System.out.println("Z:");
		Z=scanner.nextInt();
		System.out.println("a:");
		a=scanner.nextInt();
		System.out.println("DELTA:");
		DELTA=scanner.nextDouble();
		System.out.println("DELTAMax:");
		DELTAMax=scanner.nextDouble();
		System.out.println("bp:");
		bp=scanner.nextDouble();
		System.out.println("_a:");
		_a=scanner.nextDouble();
		System.out.println("_b:");
		_b=scanner.nextDouble();
		System.out.println("_C:");
		_C=scanner.nextDouble();
		System.out.println("bs:");
		bs=scanner.nextDouble();
		System.out.println("hs:");
		hs=scanner.nextDouble();
		System.out.println("hk:");
		hk=scanner.nextDouble();
		System.out.println("deltai:");
		deltai=scanner.nextDouble();
		System.out.println("bv:");
		bv=scanner.nextDouble();
		System.out.println("nv:");
		nv=scanner.nextInt();
		System.out.println("lt:");
		lt=scanner.nextDouble();
		System.out.println("KFe:");
		KFe=scanner.nextDouble();
		System.out.println("a1:");
		a1=scanner.nextDouble();
		System.out.println("c1:");
		c1=scanner.nextDouble();
		System.out.println("lp:");
		lp=scanner.nextDouble();
		System.out.println("lm:");
		lm=scanner.nextDouble();
		System.out.println("t2:");
		t2=scanner.nextDouble();
		System.out.println("bsh:");
		bsh=scanner.nextDouble();
		System.out.println("hsh:");
		hsh=scanner.nextDouble();
		System.out.println("hp:");
		hp=scanner.nextDouble();
		System.out.println("bm:");
		bm=scanner.nextDouble();
		System.out.println("hm:");
		hm=scanner.nextDouble();
		System.out.println("DELTAp:");
		DELTAp=scanner.nextDouble();
		System.out.println("dampringtype(��Բ��1�����Σ�0):");
		dampringtype=scanner.nextInt();
		System.out.println("damphere(you��1,wu��0):");
		damphere=scanner.nextInt();
		System.out.println("windingtype(dieraozu��1,boraozu��0):");
		windingtype=scanner.nextInt();
		System.out.println("af:");
		af=scanner.nextDouble();
		System.out.println("bf:");
		bf=scanner.nextDouble();
		System.out.println("Wf:");
		Wf=scanner.nextDouble();
		System.out.println("dampmate(ͭ��0����ͭ��1������ͭ��2������ALNiMe����ͭ��3�֣�4):");
		dampmate=scanner.nextInt();
		System.out.println("windingmate(ͭ��0����ͭ��1������ͭ��2������ALNiMe����ͭ��3�֣�4):");
		windingmate=scanner.nextInt();
		System.out.println("dB:");
		dB=scanner.nextDouble();
		System.out.println("lB:");
		lB=scanner.nextDouble();
		System.out.println("aR:");
		aR=scanner.nextDouble();
		System.out.println("bR:");
		bR=scanner.nextDouble();
		System.out.println("AR:");
		AR=scanner.nextDouble();
		System.out.println("DR:");
		DR=scanner.nextDouble();
		System.out.println("isdamperlink:(you:1,wu:0)");
		isdamperlink=scanner.nextInt();
		System.out.println("Si_Fe_mate:(D12,D21,D31,D41,D42,D43,Wx)");
		Si_Fe_mate=scanner.nextLine();
		System.out.println("AirCool(����0������1):");
		AirCool=scanner.nextInt();
		System.out.println("DELTApp:");
		DELTApp=scanner.nextDouble();
		
		return scanner;
	}

}
