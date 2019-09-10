/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ipkiraise;

import java.net.URL;
import java.text.DecimalFormat;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import org.controlsfx.control.textfield.TextFields;

/**
 *
 * @author Favian Azwadt R
 */
public class FXMLDocumentController implements Initializable {
    
    ObservableList sks = FXCollections.observableArrayList();
    ObservableList nilai = FXCollections.observableArrayList();
    private static DecimalFormat x = new DecimalFormat(".##");
    
    @FXML
    private TextField mk1;
    @FXML
    private TextField mk2;
    @FXML
    private TextField mk3;
    @FXML
    private TextField mk4;
    @FXML
    private TextField mk5;
    @FXML
    private TextField mk6;
    @FXML
    private TextField mk7;
    @FXML
    private TextField mk10;
    @FXML
    private TextField mk8;
    @FXML
    private TextField mk9;
    @FXML
    private ChoiceBox<String> nilai1;
    @FXML
    private ChoiceBox<String> nilai3;
    @FXML
    private ChoiceBox<String> nilai4;
    @FXML
    private ChoiceBox<String> nilai5;
    @FXML
    private ChoiceBox<String> nilai6;
    @FXML
    private ChoiceBox<String> nilai7;
    @FXML
    private ChoiceBox<String> nilai8;
    @FXML
    private ChoiceBox<String> nilai9;
    @FXML
    private ChoiceBox<String> nilai10;
    @FXML
    private ChoiceBox<String> nilai2;
    @FXML
    private ChoiceBox<String> sks1;
    @FXML
    private ChoiceBox<String> sks3;
    @FXML
    private ChoiceBox<String> sks4;
    @FXML
    private ChoiceBox<String> sks5;
    @FXML
    private ChoiceBox<String> sks6;
    @FXML
    private ChoiceBox<String> sks7;
    @FXML
    private ChoiceBox<String> sks8;
    @FXML
    private ChoiceBox<String> sks9;
    @FXML
    private ChoiceBox<String> sks10;
    @FXML
    private ChoiceBox<String> sks2;
    @FXML
    private TextField bobot1;
    @FXML
    private TextField bobot2;
    @FXML
    private TextField bobot3;
    @FXML
    private TextField bobot4;
    @FXML
    private TextField bobot5;
    @FXML
    private TextField bobot6;
    @FXML
    private TextField bobot7;
    @FXML
    private TextField bobot8;
    @FXML
    private TextField bobot9;
    @FXML
    private TextField bobot10;
    @FXML
    private TextField totalnb;
    @FXML
    private TextField nb1;
    @FXML
    private TextField nb2;
    @FXML
    private TextField nb3;
    @FXML
    private TextField nb4;
    @FXML
    private TextField nb5;
    @FXML
    private TextField nb6;
    @FXML
    private TextField nb7;
    @FXML
    private TextField nb8;
    @FXML
    private TextField nb9;
    @FXML
    private TextField nb10;
    @FXML
    private Label totalip;
    @FXML
    private TextField totalsks;
    @FXML
    private Label label1;
    @FXML
    private Label label2;
    @FXML
    private Label label3;
    @FXML
    private Label label4;
    @FXML
    private Label label5;
    @FXML
    private Button hapus;
    @FXML
    private Button hapus1;
    @FXML
    private Button hapus11;
    @FXML
    private Button hapus111;
    @FXML
    private Button hapus1111;
    @FXML
    private Button hapus11111;
    @FXML
    private Button hapus111111;
    @FXML
    private Button hapus1111111;
    @FXML
    private Button hapus11111111;
    @FXML
    private Button hapus111111111;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        loadsks();
        loadnilai();
        
        TextFields.bindAutoCompletion(mk1,"Arsitektur Komputer","Bahasa Inggris III","Bahasa Arab III","Teori Bahasa dan Otomata","Basis Data","Struktur Data","Studi Hadits","Teknologi Web","Metode Numerik"
        ,"Algoritma dan Pemrograman","Aljabar Linear","English Communication Skill","Matematika Diskrit","Organisasi Komputer","Pendidikan Kewarganegaraan","Studi Al-quran","Tata Tulis Karya Ilmiah"
        ,"Bahasa Indonesia","Dasar Pemrograman","Kalkulus","Kalkulus","Pancasila","Pengantar Teknologi Informasi dan Komunikasi","Sistem Digital");
        
        TextFields.bindAutoCompletion(mk2,"Arsitektur Komputer","Bahasa Inggris III","Bahasa Arab III","Teori Bahasa dan Otomata","Basis Data","Struktur Data","Studi Hadits","Teknologi Web","Metode Numerik"
        ,"Algoritma dan Pemrograman","Aljabar Linear","English Communication Skill","Matematika Diskrit","Organisasi Komputer","Pendidikan Kewarganegaraan","Studi Al-quran","Tata Tulis Karya Ilmiah"
        ,"Bahasa Indonesia","Dasar Pemrograman","Kalkulus","Kalkulus","Pancasila","Pengantar Teknologi Informasi dan Komunikasi","Sistem Digital");
        
        TextFields.bindAutoCompletion(mk3,"Arsitektur Komputer","Bahasa Inggris III","Bahasa Arab III","Teori Bahasa dan Otomata","Basis Data","Struktur Data","Studi Hadits","Teknologi Web","Metode Numerik"
        ,"Algoritma dan Pemrograman","Aljabar Linear","English Communication Skill","Matematika Diskrit","Organisasi Komputer","Pendidikan Kewarganegaraan","Studi Al-quran","Tata Tulis Karya Ilmiah"
        ,"Bahasa Indonesia","Dasar Pemrograman","Kalkulus","Kalkulus","Pancasila","Pengantar Teknologi Informasi dan Komunikasi","Sistem Digital");
        
        TextFields.bindAutoCompletion(mk4,"Arsitektur Komputer","Bahasa Inggris III","Bahasa Arab III","Teori Bahasa dan Otomata","Basis Data","Struktur Data","Studi Hadits","Teknologi Web","Metode Numerik"
        ,"Algoritma dan Pemrograman","Aljabar Linear","English Communication Skill","Matematika Diskrit","Organisasi Komputer","Pendidikan Kewarganegaraan","Studi Al-quran","Tata Tulis Karya Ilmiah"
        ,"Bahasa Indonesia","Dasar Pemrograman","Kalkulus","Kalkulus","Pancasila","Pengantar Teknologi Informasi dan Komunikasi","Sistem Digital");
        
        TextFields.bindAutoCompletion(mk5,"Arsitektur Komputer","Bahasa Inggris III","Bahasa Arab III","Teori Bahasa dan Otomata","Basis Data","Struktur Data","Studi Hadits","Teknologi Web","Metode Numerik"
        ,"Algoritma dan Pemrograman","Aljabar Linear","English Communication Skill","Matematika Diskrit","Organisasi Komputer","Pendidikan Kewarganegaraan","Studi Al-quran","Tata Tulis Karya Ilmiah"
        ,"Bahasa Indonesia","Dasar Pemrograman","Kalkulus","Kalkulus","Pancasila","Pengantar Teknologi Informasi dan Komunikasi","Sistem Digital");
        
        TextFields.bindAutoCompletion(mk5,"Arsitektur Komputer","Bahasa Inggris III","Bahasa Arab III","Teori Bahasa dan Otomata","Basis Data","Struktur Data","Studi Hadits","Teknologi Web","Metode Numerik"
        ,"Algoritma dan Pemrograman","Aljabar Linear","English Communication Skill","Matematika Diskrit","Organisasi Komputer","Pendidikan Kewarganegaraan","Studi Al-quran","Tata Tulis Karya Ilmiah"
        ,"Bahasa Indonesia","Dasar Pemrograman","Kalkulus","Kalkulus","Pancasila","Pengantar Teknologi Informasi dan Komunikasi","Sistem Digital");
        
        TextFields.bindAutoCompletion(mk6,"Arsitektur Komputer","Bahasa Inggris III","Bahasa Arab III","Teori Bahasa dan Otomata","Basis Data","Struktur Data","Studi Hadits","Teknologi Web","Metode Numerik"
        ,"Algoritma dan Pemrograman","Aljabar Linear","English Communication Skill","Matematika Diskrit","Organisasi Komputer","Pendidikan Kewarganegaraan","Studi Al-quran","Tata Tulis Karya Ilmiah"
        ,"Bahasa Indonesia","Dasar Pemrograman","Kalkulus","Kalkulus","Pancasila","Pengantar Teknologi Informasi dan Komunikasi","Sistem Digital");
        
        TextFields.bindAutoCompletion(mk7,"Arsitektur Komputer","Bahasa Inggris III","Bahasa Arab III","Teori Bahasa dan Otomata","Basis Data","Struktur Data","Studi Hadits","Teknologi Web","Metode Numerik"
        ,"Algoritma dan Pemrograman","Aljabar Linear","English Communication Skill","Matematika Diskrit","Organisasi Komputer","Pendidikan Kewarganegaraan","Studi Al-quran","Tata Tulis Karya Ilmiah"
        ,"Bahasa Indonesia","Dasar Pemrograman","Kalkulus","Kalkulus","Pancasila","Pengantar Teknologi Informasi dan Komunikasi","Sistem Digital");
        
        TextFields.bindAutoCompletion(mk8,"Arsitektur Komputer","Bahasa Inggris III","Bahasa Arab III","Teori Bahasa dan Otomata","Basis Data","Struktur Data","Studi Hadits","Teknologi Web","Metode Numerik"
        ,"Algoritma dan Pemrograman","Aljabar Linear","English Communication Skill","Matematika Diskrit","Organisasi Komputer","Pendidikan Kewarganegaraan","Studi Al-quran","Tata Tulis Karya Ilmiah"
        ,"Bahasa Indonesia","Dasar Pemrograman","Kalkulus","Kalkulus","Pancasila","Pengantar Teknologi Informasi dan Komunikasi","Sistem Digital");
        
        TextFields.bindAutoCompletion(mk9,"Arsitektur Komputer","Bahasa Inggris III","Bahasa Arab III","Teori Bahasa dan Otomata","Basis Data","Struktur Data","Studi Hadits","Teknologi Web","Metode Numerik"
        ,"Algoritma dan Pemrograman","Aljabar Linear","English Communication Skill","Matematika Diskrit","Organisasi Komputer","Pendidikan Kewarganegaraan","Studi Al-quran","Tata Tulis Karya Ilmiah"
        ,"Bahasa Indonesia","Dasar Pemrograman","Kalkulus","Kalkulus","Pancasila","Pengantar Teknologi Informasi dan Komunikasi","Sistem Digital");
        
        TextFields.bindAutoCompletion(mk10,"Arsitektur Komputer","Bahasa Inggris III","Bahasa Arab III","Teori Bahasa dan Otomata","Basis Data","Struktur Data","Studi Hadits","Teknologi Web","Metode Numerik"
        ,"Algoritma dan Pemrograman","Aljabar Linear","English Communication Skill","Matematika Diskrit","Organisasi Komputer","Pendidikan Kewarganegaraan","Studi Al-quran","Tata Tulis Karya Ilmiah"
        ,"Bahasa Indonesia","Dasar Pemrograman","Kalkulus","Kalkulus","Pancasila","Pengantar Teknologi Informasi dan Komunikasi","Sistem Digital");
    }

    public void loadsks()
    {
        String e = "0";
        String a = "1";
        String b = "2";
        String c = "3";
        String d = "4";
        sks.addAll(e,a,b,c,d);
        sks1.getItems().addAll(sks);
        sks2.getItems().addAll(sks);
        sks3.getItems().addAll(sks);
        sks4.getItems().addAll(sks);
        sks5.getItems().addAll(sks);
        sks6.getItems().addAll(sks);
        sks7.getItems().addAll(sks);
        sks8.getItems().addAll(sks);
        sks9.getItems().addAll(sks);
        sks10.getItems().addAll(sks);
        sks1.getSelectionModel().selectFirst();
        sks2.getSelectionModel().selectFirst();
        sks3.getSelectionModel().selectFirst();
        sks4.getSelectionModel().selectFirst();
        sks5.getSelectionModel().selectFirst();
        sks6.getSelectionModel().selectFirst();
        sks7.getSelectionModel().selectFirst();
        sks8.getSelectionModel().selectFirst();
        sks9.getSelectionModel().selectFirst();
        sks10.getSelectionModel().selectFirst();
    }
    
    public void loadnilai()
    {
        String a = "A";
        String b = "A-";
        String c = "B+";
        String d = "B";
        String e = "B-";
        String f = "C+";
        String g = "C";
        String h = "D";
        String i = "E";
        nilai.addAll(a,b,c,d,e,f,g,h,i);
        nilai1.getItems().addAll(nilai);
        nilai2.getItems().addAll(nilai);
        nilai3.getItems().addAll(nilai);
        nilai4.getItems().addAll(nilai);
        nilai5.getItems().addAll(nilai);
        nilai6.getItems().addAll(nilai);
        nilai7.getItems().addAll(nilai);
        nilai8.getItems().addAll(nilai);
        nilai9.getItems().addAll(nilai);
        nilai10.getItems().addAll(nilai);
    }
    
    public void bobot1()
    {
        String ayam = nilai1.getValue();
        if("A".equals(ayam))
        {
            bobot1.setText("4");
        }
        if("A-".equals(ayam))
        {
            bobot1.setText("3.7");
        }
        if("B+".equals(ayam))
        {
            bobot1.setText("3.3");
        }
        if("B".equals(ayam))
        {
            bobot1.setText("3");
        }
        if("B-".equals(ayam))
        {
            bobot1.setText("2.7");
        }
        if("C+".equals(ayam))
        {
            bobot1.setText("2.3");
        }
        if("C".equals(ayam))
        {
            bobot1.setText("2");
        }
        if("D".equals(ayam))
        {
            bobot1.setText("1");
        }
        if("E".equals(ayam))
        {
            bobot1.setText("0");
        }
    }
    public void bobot2()
    {
        String ayam = nilai2.getValue();
        if("A".equals(ayam))
        {
            bobot2.setText("4");
        }
        if("A-".equals(ayam))
        {
            bobot2.setText("3.7");
        }
        if("B+".equals(ayam))
        {
            bobot2.setText("3.3");
        }
        if("B".equals(ayam))
        {
            bobot2.setText("3");
        }
        if("B-".equals(ayam))
        {
            bobot2.setText("2.7");
        }
        if("C+".equals(ayam))
        {
            bobot2.setText("2.3");
        }
        if("C".equals(ayam))
        {
            bobot2.setText("2");
        }
        if("D".equals(ayam))
        {
            bobot2.setText("1");
        }
        if("E".equals(ayam))
        {
            bobot2.setText("0");
        }
    }
    public void bobot3()
    {
        String ayam = nilai3.getValue();
        if("A".equals(ayam))
        {
            bobot3.setText("4");
        }
        if("A-".equals(ayam))
        {
            bobot3.setText("3.7");
        }
        if("B+".equals(ayam))
        {
            bobot3.setText("3.3");
        }
        if("B".equals(ayam))
        {
            bobot3.setText("3");
        }
        if("B-".equals(ayam))
        {
            bobot3.setText("2.7");
        }
        if("C+".equals(ayam))
        {
            bobot3.setText("2.3");
        }
        if("C".equals(ayam))
        {
            bobot3.setText("2");
        }
        if("D".equals(ayam))
        {
            bobot3.setText("1");
        }
        if("E".equals(ayam))
        {
            bobot3.setText("0");
        }
    }
    public void bobot4()
    {
        String ayam = nilai4.getValue();
        if("A".equals(ayam))
        {
            bobot4.setText("4");
        }
        if("A-".equals(ayam))
        {
            bobot4.setText("3.7");
        }
        if("B+".equals(ayam))
        {
            bobot4.setText("3.3");
        }
        if("B".equals(ayam))
        {
            bobot4.setText("3");
        }
        if("B-".equals(ayam))
        {
            bobot4.setText("2.7");
        }
        if("C+".equals(ayam))
        {
            bobot4.setText("2.3");
        }
        if("C".equals(ayam))
        {
            bobot4.setText("2");
        }
        if("D".equals(ayam))
        {
            bobot4.setText("1");
        }
        if("E".equals(ayam))
        {
            bobot4.setText("0");
        }
    }
    public void bobot5()
    {
        String ayam = nilai5.getValue();
        if("A".equals(ayam))
        {
            bobot5.setText("4");
        }
        if("A-".equals(ayam))
        {
            bobot5.setText("3.7");
        }
        if("B+".equals(ayam))
        {
            bobot5.setText("3.3");
        }
        if("B".equals(ayam))
        {
            bobot5.setText("3");
        }
        if("B-".equals(ayam))
        {
            bobot5.setText("2.7");
        }
        if("C+".equals(ayam))
        {
            bobot5.setText("2.3");
        }
        if("C".equals(ayam))
        {
            bobot5.setText("2");
        }
        if("D".equals(ayam))
        {
            bobot5.setText("1");
        }
        if("E".equals(ayam))
        {
            bobot5.setText("0");
        }
    }
    public void bobot6()
    {
        String ayam = nilai6.getValue();
        if("A".equals(ayam))
        {
            bobot6.setText("4");
        }
        if("A-".equals(ayam))
        {
            bobot6.setText("3.7");
        }
        if("B+".equals(ayam))
        {
            bobot6.setText("3.3");
        }
        if("B".equals(ayam))
        {
            bobot6.setText("3");
        }
        if("B-".equals(ayam))
        {
            bobot6.setText("2.7");
        }
        if("C+".equals(ayam))
        {
            bobot6.setText("2.3");
        }
        if("C".equals(ayam))
        {
            bobot6.setText("2");
        }
        if("D".equals(ayam))
        {
            bobot6.setText("1");
        }
        if("E".equals(ayam))
        {
            bobot6.setText("0");
        }
    }
    public void bobot7()
    {
        String ayam = nilai7.getValue();
        if("A".equals(ayam))
        {
            bobot7.setText("4");
        }
        if("A-".equals(ayam))
        {
            bobot7.setText("3.7");
        }
        if("B+".equals(ayam))
        {
            bobot7.setText("3.3");
        }
        if("B".equals(ayam))
        {
            bobot7.setText("3");
        }
        if("B-".equals(ayam))
        {
            bobot7.setText("2.7");
        }
        if("C+".equals(ayam))
        {
            bobot7.setText("2.3");
        }
        if("C".equals(ayam))
        {
            bobot7.setText("2");
        }
        if("D".equals(ayam))
        {
            bobot7.setText("1");
        }
        if("E".equals(ayam))
        {
            bobot7.setText("0");
        }
    }
    public void bobot8()
    {
        String ayam = nilai8.getValue();
        if("A".equals(ayam))
        {
            bobot8.setText("4");
        }
        if("A-".equals(ayam))
        {
            bobot8.setText("3.7");
        }
        if("B+".equals(ayam))
        {
            bobot8.setText("3.3");
        }
        if("B".equals(ayam))
        {
            bobot8.setText("3");
        }
        if("B-".equals(ayam))
        {
            bobot8.setText("2.7");
        }
        if("C+".equals(ayam))
        {
            bobot8.setText("2.3");
        }
        if("C".equals(ayam))
        {
            bobot8.setText("2");
        }
        if("D".equals(ayam))
        {
            bobot8.setText("1");
        }
        if("E".equals(ayam))
        {
            bobot8.setText("0");
        }
    }
    public void bobot9()
    {
        String ayam = nilai9.getValue();
        if("A".equals(ayam))
        {
            bobot9.setText("4");
        }
        if("A-".equals(ayam))
        {
            bobot9.setText("3.7");
        }
        if("B+".equals(ayam))
        {
            bobot9.setText("3.3");
        }
        if("B".equals(ayam))
        {
            bobot9.setText("3");
        }
        if("B-".equals(ayam))
        {
            bobot9.setText("2.7");
        }
        if("C+".equals(ayam))
        {
            bobot9.setText("2.3");
        }
        if("C".equals(ayam))
        {
            bobot9.setText("2");
        }
        if("D".equals(ayam))
        {
            bobot9.setText("1");
        }
        if("E".equals(ayam))
        {
            bobot9.setText("0");
        }
    }
    public void bobot10()
    {
        String ayam = nilai10.getValue();
        if("A".equals(ayam))
        {
            bobot10.setText("4");
        }
        if("A-".equals(ayam))
        {
            bobot10.setText("3.7");
        }
        if("B+".equals(ayam))
        {
            bobot10.setText("3.3");
        }
        if("B".equals(ayam))
        {
            bobot10.setText("3");
        }
        if("B-".equals(ayam))
        {
            bobot10.setText("2.7");
        }
        if("C+".equals(ayam))
        {
            bobot10.setText("2.3");
        }
        if("C".equals(ayam))
        {
            bobot10.setText("2");
        }
        if("D".equals(ayam))
        {
            bobot10.setText("1");
        }
        if("E".equals(ayam))
        {
            bobot10.setText("0");
        }
    }
    
    public void nb1()
    {
        double ayam = Integer.parseInt(sks1.getValue());
        double kambing = Double.parseDouble(bobot1.getText());
        nb1.setText(String.valueOf(x.format(ayam*kambing)));
    }
    public void nb2()
    {
        double ayam = Integer.parseInt(sks2.getValue());
        double kambing = Double.parseDouble(bobot2.getText());
        nb2.setText(String.valueOf(x.format(ayam*kambing)));
    }
    public void nb3()
    {
        double ayam = Integer.parseInt(sks3.getValue());
        double kambing = Double.parseDouble(bobot3.getText());
        nb3.setText(String.valueOf(x.format(ayam*kambing)));
    }
    public void nb4()
    {
        double ayam = Integer.parseInt(sks4.getValue());
        double kambing = Double.parseDouble(bobot4.getText());
        nb4.setText(String.valueOf(x.format(ayam*kambing)));
    }
    public void nb5()
    {
        double ayam = Integer.parseInt(sks5.getValue());
        double kambing = Double.parseDouble(bobot5.getText());
        nb5.setText(String.valueOf(x.format(ayam*kambing)));
    }
    public void nb6()
    {
        double ayam = Integer.parseInt(sks6.getValue());
        double kambing = Double.parseDouble(bobot6.getText());
        nb6.setText(String.valueOf(x.format(ayam*kambing)));
    }
    public void nb7()
    {
        double ayam = Integer.parseInt(sks7.getValue());
        double kambing = Double.parseDouble(bobot7.getText());
        nb7.setText(String.valueOf(x.format(ayam*kambing)));
    }
    public void nb8()
    {
        double ayam = Integer.parseInt(sks8.getValue());
        double kambing = Double.parseDouble(bobot8.getText());
        nb8.setText(String.valueOf(x.format(ayam*kambing)));
    }
    public void nb9()
    {
        double ayam = Integer.parseInt(sks9.getValue());
        double kambing = Double.parseDouble(bobot9.getText());
        nb9.setText(String.valueOf(x.format(ayam*kambing)));
    }
    public void nb10()
    {
        double ayam = Integer.parseInt(sks10.getValue());
        double kambing = Double.parseDouble(bobot10.getText());
        nb10.setText(String.valueOf(x.format(ayam*kambing)));
    }

    @FXML
    private void hitung() {
        bobot1();
        bobot2();
        bobot3();
        bobot4();
        bobot5();
        bobot6();
        bobot7();
        bobot8();
        bobot9();
        bobot10();
        
        int a1 = Integer.parseInt(sks1.getValue());
        int a2 = Integer.parseInt(sks2.getValue());
        int a3 = Integer.parseInt(sks3.getValue());
        int a4 = Integer.parseInt(sks4.getValue());
        int a5 = Integer.parseInt(sks5.getValue());
        int a6 = Integer.parseInt(sks6.getValue());
        int a7 = Integer.parseInt(sks7.getValue());
        int a8 = Integer.parseInt(sks8.getValue());
        int a9 = Integer.parseInt(sks9.getValue());
        int a10 = Integer.parseInt(sks10.getValue());
        int ayam = a1+a2+a3+a4+a5+a6+a7+a8+a9+a10;
        
        totalsks.setText(String.valueOf(ayam));
        
        nb1();
        nb2();
        nb3();
        nb4();
        nb5();
        nb6();
        nb7();
        nb8();
        nb9();
        nb10();
        
        double b1 = Double.parseDouble(nb1.getText());
        double b2 = Double.parseDouble(nb2.getText());
        double b3 = Double.parseDouble(nb3.getText());
        double b4 = Double.parseDouble(nb4.getText());
        double b5 = Double.parseDouble(nb5.getText());
        double b6 = Double.parseDouble(nb6.getText());
        double b7 = Double.parseDouble(nb7.getText());
        double b8 = Double.parseDouble(nb8.getText());
        double b9 = Double.parseDouble(nb9.getText());
        double b10 = Double.parseDouble(nb10.getText());
        
        totalnb.setText(String.valueOf(x.format(b1+b2+b3+b4+b5+b6+b7+b8+b9+b10)));
        
        int kucing = Integer.parseInt(totalsks.getText());
        double siput = Double.parseDouble(totalnb.getText());
        
        totalip.setText(String.valueOf(x.format(siput/kucing)));
        
        label1.setVisible(true);
        label2.setVisible(true);
        label3.setVisible(true);
        label4.setVisible(true);
        label5.setVisible(true);
        totalip.setVisible(true);
        totalsks.setVisible(true);
        totalnb.setVisible(true);
        bobot1.setVisible(true);
        bobot2.setVisible(true);
        bobot3.setVisible(true);
        bobot4.setVisible(true);
        bobot5.setVisible(true);
        bobot6.setVisible(true);
        bobot7.setVisible(true);
        bobot8.setVisible(true);
        bobot9.setVisible(true);
        bobot10.setVisible(true);
        nb1.setVisible(true);
        nb2.setVisible(true);
        nb3.setVisible(true);
        nb4.setVisible(true);
        nb5.setVisible(true);
        nb6.setVisible(true);
        nb7.setVisible(true);
        nb8.setVisible(true);
        nb9.setVisible(true);
        nb10.setVisible(true);
    }

    @FXML
    private void hapus1(ActionEvent event) {
    }

    @FXML
    private void hapus2(ActionEvent event) {
    }

    @FXML
    private void hapus3(ActionEvent event) {
    }

    @FXML
    private void hapus4(ActionEvent event) {
    }

    @FXML
    private void hapus5(ActionEvent event) {
    }

    @FXML
    private void hapus6(ActionEvent event) {
    }

    @FXML
    private void hapus7(ActionEvent event) {
    }

    @FXML
    private void hapus8(ActionEvent event) {
    }

    @FXML
    private void hapus9(ActionEvent event) {
    }

    @FXML
    private void hapus10(ActionEvent event) {
    }
}
