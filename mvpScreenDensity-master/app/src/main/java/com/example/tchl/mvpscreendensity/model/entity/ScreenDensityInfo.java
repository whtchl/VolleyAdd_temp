package com.example.tchl.mvpscreendensity.model.entity;

/**
 * Created by tchl on 2016-05-15.
 */
public class ScreenDensityInfo {
    private String  pmkg;  //屏幕宽高（像素）;
    private String  kgcc;   //宽高尺寸（dpi）
    private String  kg_dpi;                   /*宽高 dpi*/
    /*刷新频率*/
    private  String sxpl;
    /*密度比例*/
    private String mdbl;
    /*密度dpi*/
    private String md_dpi;
    /*屏幕密度*/
    private String pmmd;
    /*宽高 英寸*/
    private String kgyc;
    /*宽高 厘米*/
    private String kglm;
    /*对角线 英寸*/
    private String djxyc;
    /*对角线 厘米*/
    private String djxlm;
    /*每英寸像素*/
    private String mycxs;

    public String getPmkg(){ return pmkg;}
    public void setPmkg(String pmkg){ this.pmkg=pmkg;}

    public String getKgcc(){ return kgcc; }
    public void setKgcc(String kgcc) {this.kgcc=kgcc;}

    public String getKg_dpi() { return kg_dpi;}
    public void setKg_dpi(String kg_dpi){ this.kg_dpi = kg_dpi;}

    public String getSxpl(){return sxpl;}
    public void setSxpl(String sxpl){ this.sxpl=sxpl;}

    public String getMdbl(){return mdbl;}
    public void setMdbl(String mdbl){ this.mdbl = mdbl;}

    public String getMd_dpi(){return md_dpi;}
    public void setMd_dpi(String md_dpi){this.md_dpi=md_dpi;}

    public String getPmmd(){return pmmd;}
    public void setPmmd(String pmmd){this.pmmd=pmmd;}

    public String getKgyc(){return kgyc;}
    public void setKgyc(String kgyc){this.kgcc=kgcc;}

    public String getKglm(){return kglm;}
    public void setKglm(String kglm){ this.kglm=kglm;}

    public String getDjxyc(){return djxyc;}
    public void setDjxyc(String djxyc){this.djxyc = djxyc;}

    public String getDjxlm(){ return djxlm;}
    public void setDjxlm(String djxlm){this.djxlm=djxlm;}

    public String getMycxs(){return mycxs;}
    public void setMycxs(String mycxs){this.mycxs=mycxs;}




}
