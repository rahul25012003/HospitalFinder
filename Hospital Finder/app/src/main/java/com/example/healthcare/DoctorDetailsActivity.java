package com.example.healthcare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;

public class DoctorDetailsActivity extends AppCompatActivity {
    private String[][] doctor_details1 =
            {
                    {"Doctor Name : Dr. Pavan Kumar", "Hospital Address :3HX7+CR,YELAHANKA", "Exp :14yrs", "Mobile No:9449240254", "500"},
                    {"Doctor Name : Dr.Hemanth", "Hospital Address :4H6J+53V,DODDABALLAPUR", "Exp : 10yrs", "Mobile No:9845206787", "600"},
                    {"Doctor Name : Dr.Sabhapathi.S.V", "Hospital Address :WHJQ+6J,BANGALORE ", "Exp : 8yrs", "Mobile No:8026606529", "500"},
                    {"Doctor Name : Dr.Venkatesh", "Hospital Address : 2JMP+44,KALAYAN NAGAR", "Exp : 20yrs", "Mobile No:9731513153", "500"},
                    {"Doctor Name : Dr.Chengappa", "Hospital Address : XJCV+5J,INDIRA NAGAR", "Exp : 10yrs", "Mobile No:7019141550", "800"},
                    {"Doctor Name : Dr.Shankar R Kurpad", "Hospital Address : Malleshwaram, Bangalore", "Exp : 40yrs", "Mobile No:7019340550", "800"},
                    {"Doctor Name : Dr.Satish Babu", "Hospital Address : Bilekahalli, Bangalore", "Exp : 3yrs", "Mobile No:7019140530", "800"},
                    {"Doctor Name : Dr.Dixit", "Hospital Address : Thoughtworks Office, Bangalore", "Exp : 2yrs", "Mobile No:7019147550", "800"},
                    {"Doctor Name : Dr.Akshay S", "Hospital Address : Kundalahalli, Bangalore", "Exp : 5yrs", "Mobile No:7019140950", "800"},
                    {"Doctor Name : Dr.BT Rudres", "Hospital Address : Basavanagudi, Bangalore", "Exp : 1yr", "Mobile No:7019140050", "800"}

            };
    private String[][] doctor_details2 =
            {
                    {"Doctor Name : Dr.Shekhar", "Hospital Address : Tin factory", "Exp : 5yrs", "Mobile No:9898989898", "600"},
                    {"Doctor Name : Dr.Shreyas", "Hospital Address : Doddakannelli, Bangalore", "Exp : 15yrs", "Mobile No:7898989898", "900"},
                    {"Doctor Name : Dr.Elizabeth Jayaseelane", "Hospital Address : Whitefield, Bangalore", "Exp : 8yrs", "Mobile No:8898989898", "300"},
                    {"Doctor Name : Dr.Mayuri Deshmukh", "Hospital Address : Rajanukunte, Bangalore", "Exp : 6yrs", "Mobile No:9898000000", "500"},
                    {"Doctor Name : Dr.Minakshi chowdary", "Hospital Address : katraguppe, Bangalore", "Exp : 8yrs", "Mobile No:7798986898", "800"},
                    {"Doctor Name : Dr.Kumaresh", "Hospital Address : Arekerre Mico Layout, Bangalore", "Exp : 15yrs", "Mobile No:7798988898", "800"},
                    {"Doctor Name : Dr.Vanita Mathew", "Hospital Address : Opposite Cafe Coffee Day, Bangalore", "Exp : 20yrs", "Mobile No:7798349898", "800"},
                    {"Doctor Name : Dr.Shetty", "Hospital Address : Rajaji Nagar, Bangalore", "Exp : 7yrs", "Mobile No:7798989128", "800"},
                    {"Doctor Name : Dr.K Srinivasa Murthy", "Hospital Address : Shanti Nagar, Bangalore", "Exp : 6yrs", "Mobile No:7798099898", "800"},
                    {"Doctor Name : Dr.Yashas", "Hospital Address : Whitefield,Bangalore", "Exp : 7yrs", "Mobile No:7798985698", "800"}

            };
    private String[][] doctor_details3 =
            {
                    {"Doctor Name : Dr.R.Sathyanarayana", "Hospital Address : Indiranagar, Bangalor", "Exp : 5yrs", "Mobile No:9898989898", "600"},
                    {"Doctor Name : Dr.Jayanti S Thumsi", "Hospital Address : RR Nagar, Bangalore", "Exp : 15yrs", "Mobile No:7898989898", "900"},
                    {"Doctor Name : Dr.J.Lakshmikanth", "Hospital Address : Spine Clinic, 4th Cross Road, 7th Block, Bangalore", "Exp : 8yrs", "Mobile No:8898989898", "300"},
                    {"Doctor Name : Dr.Ravikiran", "Hospital Address : Kundalahalli Gate, Bangalore", "Exp : 6yrs", "Mobile No:9898000000", "500"},
                    {"Doctor Name : Dr.Sonia", "Hospital Address : Sahakaranagar, Bangalore", "Exp : 7yrs", "Mobile No:7798989898", "800"},
                    {"Doctor Name : Dr.Deepak Haldipur", "Hospital Address : Basaveshwara Nagar, Bangaloree", "Exp : 8yrs", "Mobile No:7798989898", "800"},
                    {"Doctor Name : Dr.Mukta Sachdev", "Hospital Address :  Ulsoor, Bangalore", "Exp : 7yrs", "Mobile No:7798989898", "800"},
                    {"Doctor Name : Dr.B.Ganapathi", "Hospital Address :  Bannerghatta Road, Bangalor", "Exp : 7yrs", "Mobile No:7798989898", "800"},
                    {"Doctor Name : Dr.Susheela Suresh", "Hospital Address : Rajaji Nagar, 1st Block, Bangalore", "Exp : 7yrs", "Mobile No:7798989898", "800"},
                    {"Doctor Name : Dr.Guruprasad Hosurkar", "Hospital Address : Godrej Woodsman Estate, Bangalore", "Exp : 7yrs", "Mobile No:7798989898", "800"}

            };
    private String[][] doctor_details4 =
            {
                    {"Doctor Name : Dr. Kishore", "Hospital Address : 3HXQ+RG Bengaluru, Karnataka", "Exp : 5yrs", "Mobile No:09632058805", "600"},
                    {"Doctor Name : Dr. Arun Kumar ", "Hospital Address : 3HWW+RC Bengaluru, Karnataka", "Exp : 15yrs", "Mobile No:08050010851", "900"},
                    {"Doctor Name : Dr. Shashikanth Vokkaleri", "Hospital Address : 4H3G+JP Bengaluru, Karnataka", "Exp : 8yrs", "Mobile No:09880980157", "300"},
                    {"Doctor Name : Dr. Vineet", "Hospital Address : 2M93+JC Bengaluru, Karnataka", "Exp : 6yrs", "Mobile No:09448315823", "500"},
                    {"Doctor Name : Dr. Prashanth R", "Hospital Address : 2J8V+R7 Bengaluru, Karnataka", "Exp : 7yrs", "Mobile No:07829412222", "800"},
                    {"Doctor Name : Dr. Dr Vishal Naik", "Hospital Address : XHPJ+34 Bengaluru, Karnataka", "Exp : 15yrs", "Mobile No:09943680950", "500"},
                    {"Doctor Name : Dr. Chetan Satish", "Hospital Address : 2H74+P9 Bengaluru, Karnataka", "Exp : 10yrs", "Mobile No:18001024647", "750"},
                    {"Doctor Name : Dr. Govind Nandakumar", "Hospital Address : 2H74+MC Bengaluru, Karnataka", "Exp : 15yrs", "Mobile No:18001024647", "600"},
                    {"Doctor Name : Dr. Sathish N", "Hospital Address : XHR4+PX Bengaluru, Karnataka", "Exp : 20yrs", "Mobile No:18001024647", "900"},
                    {"Doctor Name : Dr. Bharath", "Hospital Address : 2GHQ+23 Bengaluru, Karnataka", "Exp : 10yrs", "Mobile No:07303762792", "800"}
            };
    private String[][] doctor_details5 =
            {
                    {"Doctor Name : Dr. Vikram Kolhari", "Hospital Address : XHQF+83 Bengaluru, Karnataka", "Exp : 15yrs", "Mobile No:18605001066", "1600"},
                    {"Doctor Name : Dr. Keshava R", "Hospital Address : XHQV+8Q Bengaluru, Karnataka", "Exp : 10yrs", "Mobile No:09686860310", "1900"},
                    {"Doctor Name : Dr. Abhijit Vilas Kulkarni", "Hospital Address : WHPM+GQ Bengaluru, Karnataka", "Exp : 18yrs", "Mobile No:18605001066", "1300"},
                    {"Doctor Name : Dr. Gopi A", "Hospital Address : XHQV+8Q Bengaluru, Karnataka", "Exp : 16yrs", "Mobile No:9686860310", "1500"},
                    {"Doctor Name : Dr. G Vivek", "Hospital Address : XG8P+VH Bengaluru, Karnataka", "Exp : 10yrs", "Mobile No:09740080257", "1800"},
                    {"Doctor Name : Dr.Rahul Shetty", "Hospital Address : VH5Q+C7 Bengaluru, Karnataka", "Exp : 5yrs", "Mobile No:09987343374", "1200"},
                    {"Doctor Name : Dr. Srinivasa Prasad B V", "Hospital Address : WHFQ+C6 Bengaluru, Karnataka", "Exp : 15yrs", "Mobile No:08589922924", "1500"},
                    {"Doctor Name : Dr. Pradeep Kumar D", "Hospital Address : 2HCR+6W Bengaluru, Karnataka", "Exp : 10yrs", "Mobile No:09886662700", "1000"},
                    {"Doctor Name : Dr. Mahadev Swamy", "Hospital Address : XJCV+7P Bengaluru, Karnataka", "Exp : 20yrs", "Mobile No:08110086551", "1500"},
                    {"Doctor Name : Dr. Sachin", "Hospital Address : 8JG8+99 Mysuru, Karnataka", "Exp : 22yrs", "Mobile No:06360359678", "1800"}
            };
    TextView tv;
    Button btn;
    String[][] doctor_details = {};
    HashMap<String,String> item;
    ArrayList list;
    SimpleAdapter sa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor_details);

        tv = findViewById(R.id.textViewDDTitle);
        btn = findViewById(R.id.buttonBMCartBack);

        Intent it = getIntent();
        String title = it.getStringExtra("title");
        tv.setText(title);

        if(title.compareTo("Family Physicians")==0)
            doctor_details = doctor_details1;
        else
        if(title.compareTo("Dietician")==0)
            doctor_details = doctor_details2;
        else
        if(title.compareTo("Dentist")==0)
            doctor_details = doctor_details3;
        else
        if(title.compareTo("Surgeon")==0)
            doctor_details = doctor_details4;
        else
            doctor_details = doctor_details5;

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DoctorDetailsActivity.this,FindDoctorActivity.class));
            }
        });

        list = new ArrayList();
        for(int i=0;i<doctor_details.length;i++){
            item = new HashMap<String,String>();
            item.put( "line1", doctor_details[i][0]);
            item.put( "line2", doctor_details[i][1]);
            item.put( "line3", doctor_details[i][2]);
            item.put( "line4", doctor_details[i][3]);
            item.put( "line5", "Cons Fees:"+doctor_details[i][4]+"/-");
            list.add( item );
        }
        sa = new SimpleAdapter(this,list,
                R.layout.multi_lines,
                new String[]{"line1","line2","line3","line4","line5"},
                new int[]{R.id.line_a,R.id.line_b,R.id.line_c,R.id.line_d,R.id.line_e}
                );
        ListView lst = findViewById(R.id.listViewBMCart);
        lst.setAdapter(sa);

        lst.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent it = new Intent(DoctorDetailsActivity.this,BookAppointmentActivity.class);
                it.putExtra("text1",title);
                it.putExtra("text2",doctor_details[i][0]);
                it.putExtra("text3",doctor_details[i][1]);
                it.putExtra("text4",doctor_details[i][3]);
                it.putExtra("text5",doctor_details[i][4]);
                startActivity(it);
            }
        });
    }
}