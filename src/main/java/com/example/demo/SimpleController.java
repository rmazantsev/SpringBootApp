package com.example.demo;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {

    private SimpleDao dao;

    public SimpleController(SimpleDao dao) {
        this.dao = dao;
    }

    @CrossOrigin
    @GetMapping("/api/shipments")
    public String getShipments() {
        return dao.findAll();
    }


    @CrossOrigin
    @GetMapping("/api")
    public String getApi() {
        return "api";
    }


    @CrossOrigin
    @GetMapping("/")
    public String getHello() {
        return "[\n" +
                "  {\n" +
                "    \"id\": \"e40b72\",\n" +
                "    \"name\": \"Walmart\",\n" +
                "    \"email\": \"contact@walmart.com\",\n" +
                "    \"boxes\": \"3.3,3,3.2,1.6,5.4,2.1,2.7,4.6\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": \"84674be8\",\n" +
                "    \"name\": \"Exxon Mobil\",\n" +
                "    \"email\": \"contact@exxonmobil.com\",\n" +
                "    \"boxes\": null\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": \"34554e30e6ac1a4\",\n" +
                "    \"name\": \"Apple\",\n" +
                "    \"email\": \"contact@apple.com\",\n" +
                "    \"boxes\": \"9.6,3.5\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": \"7ac25980a066\",\n" +
                "    \"name\": \"Berkshire Hathaway\",\n" +
                "    \"email\": \"contact@berkshirehathaway.com\",\n" +
                "    \"boxes\": \"2.1,3.9,5.3,3.3,7.1\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": \"d3ff0c68892\",\n" +
                "    \"name\": \"Amazon.com\",\n" +
                "    \"email\": \"contact@amazon.com\",\n" +
                "    \"boxes\": \"6.8,7.9,3.6,8.8,4.8,9.4\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": \"f0427677ad30dfae35\",\n" +
                "    \"name\": \"UnitedHealth Group\",\n" +
                "    \"email\": \"contact@unitedhealthgroup.com\",\n" +
                "    \"boxes\": \"2.3,3.7,8.6,6.5,8,9.8,1.4\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": \"2956dd9db349d3\",\n" +
                "    \"name\": \"McKesson\",\n" +
                "    \"email\": \"contact@mckesson.com\",\n" +
                "    \"boxes\": \"5.1,3.7\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": \"b324c2c616c5b139d58d\",\n" +
                "    \"name\": \"CVS Health\",\n" +
                "    \"email\": \"contact@cvshealth.com\",\n" +
                "    \"boxes\": \"8.3,6.4,9.8,2.4,6.1,0.2,9.2,6.5\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": \"5056862\",\n" +
                "    \"name\": \"AT&T\",\n" +
                "    \"email\": \"contact@att.com\",\n" +
                "    \"boxes\": \"9.1,2.3,1.8,7.5,8.7,5.2\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": \"b06e1755de81ea32c6cb\",\n" +
                "    \"name\": \"AmerisourceBergen\",\n" +
                "    \"email\": \"contact@amerisourcebergen.com\",\n" +
                "    \"boxes\": \"1.8,6.1,3\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": \"46099ca17ef365\",\n" +
                "    \"name\": \"Chevron\",\n" +
                "    \"email\": \"contact@chevron.com\",\n" +
                "    \"boxes\": \"7.6,5,6.3,1.4,7.5,6.5,10,3.4,9.8,4.5\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": \"355d7c91157eb20d5\",\n" +
                "    \"name\": \"Ford Motor\",\n" +
                "    \"email\": \"contact@fordmotor.com\",\n" +
                "    \"boxes\": \"6.2,5.9,4,6.9,4.4,1.7,9.5\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": \"685658ffbdc9a7a3c3\",\n" +
                "    \"name\": \"General Motors\",\n" +
                "    \"email\": \"contact@generalmotors.com\",\n" +
                "    \"boxes\": \"3.6,7.8\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": \"19edd45f1\",\n" +
                "    \"name\": \"Costco Wholesale\",\n" +
                "    \"email\": \"contact@costcowholesale.com\",\n" +
                "    \"boxes\": \"9.1,6.4,8.6,1.7\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": \"c2907f8b\",\n" +
                "    \"name\": \"Alphabet\",\n" +
                "    \"email\": \"contact@alphabet.com\",\n" +
                "    \"boxes\": \"9.4\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": \"2c692f0b89\",\n" +
                "    \"name\": \"Cardinal Health\",\n" +
                "    \"email\": \"contact@cardinalhealth.com\",\n" +
                "    \"boxes\": \"0.9,9.5,6.7,0.2,3.8,8.6,8.5,9,8.2,3.9\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": \"d77b66458\",\n" +
                "    \"name\": \"Walgreens Boots Alliance\",\n" +
                "    \"email\": \"contact@walgreensbootsalliance.com\",\n" +
                "    \"boxes\": \"5.9,4.7,4.3,9.2,3.1,3.6,4.9,4.5,7.3\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": \"4723e8d3a47928f\",\n" +
                "    \"name\": \"JPMorgan Chase\",\n" +
                "    \"email\": \"contact@jpmorganchase.com\",\n" +
                "    \"boxes\": \"7.5\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": \"eca9af76317\",\n" +
                "    \"name\": \"Verizon Communications\",\n" +
                "    \"email\": \"contact@verizoncommunications.com\",\n" +
                "    \"boxes\": \"0,8.7,6,0.8,4.9,4.8,1.4,9.4\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": \"4c88d2e\",\n" +
                "    \"name\": \"Kroger\",\n" +
                "    \"email\": \"contact@kroger.com\",\n" +
                "    \"boxes\": \"6.2,9,1.2,2,7.1,2.4\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": \"07a8f00ef\",\n" +
                "    \"name\": \"General Electric\",\n" +
                "    \"email\": \"contact@generalelectric.com\",\n" +
                "    \"boxes\": \"7.3\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": \"3ec0d109d\",\n" +
                "    \"name\": \"Fannie Mae\",\n" +
                "    \"email\": \"contact@fanniemae.com\",\n" +
                "    \"boxes\": \"4.7,6.3,7.9\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": \"586bf63939dae10f64b\",\n" +
                "    \"name\": \"Phillips 66\",\n" +
                "    \"email\": \"contact@phillips.com\",\n" +
                "    \"boxes\": \"8.5,6.5,9.6,3.1,1.3,9,0.3,8.6,4.8\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": \"0254834bb6e55\",\n" +
                "    \"name\": \"Valero Energy\",\n" +
                "    \"email\": \"contact@valeroenergy.com\",\n" +
                "    \"boxes\": \"5.1,4.1,6.6,1.6,3.9,3.4,1.9\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": \"5df3dc7d\",\n" +
                "    \"name\": \"Bank of America\",\n" +
                "    \"email\": \"contact@bankofamerica.com\",\n" +
                "    \"boxes\": \"5.6\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": \"dae4b\",\n" +
                "    \"name\": \"Microsoft\",\n" +
                "    \"email\": \"contact@microsoft.com\",\n" +
                "    \"boxes\": \"8.5,3.5,2.1,5.2,9.9\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": \"17db91a0\",\n" +
                "    \"name\": \"Home Depot\",\n" +
                "    \"email\": \"contact@homedepot.com\",\n" +
                "    \"boxes\": \"3\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": \"c035fb24b33a640cdca\",\n" +
                "    \"name\": \"Boeing\",\n" +
                "    \"email\": \"contact@boeing.com\",\n" +
                "    \"boxes\": \"5.2,1.4,8.5,3.8\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": \"98fb1675\",\n" +
                "    \"name\": \"Wells Fargo\",\n" +
                "    \"email\": \"contact@wellsfargo.com\",\n" +
                "    \"boxes\": \"6.4,4.8,5.2,4.9,0.4,0.2,5.3,4.3\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": \"c14c67737\",\n" +
                "    \"name\": \"Citigroup\",\n" +
                "    \"email\": \"contact@citigroup.com\",\n" +
                "    \"boxes\": \"8.9,6.4,6,0,7.7,8\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": \"518ab4\",\n" +
                "    \"name\": \"Marathon Petroleum\",\n" +
                "    \"email\": \"contact@marathonpetroleum.com\",\n" +
                "    \"boxes\": \"5.5,3.7,3.1,0.8,0.4,9.3,9.9\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": \"dc19044ebe1\",\n" +
                "    \"name\": \"Comcast\",\n" +
                "    \"email\": \"contact@comcast.com\",\n" +
                "    \"boxes\": \"6.5,3.7,1.3,8.9,4.4,1.9,9.9\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": \"5b5c25e8b99795\",\n" +
                "    \"name\": \"Anthem\",\n" +
                "    \"email\": \"contact@anthem.com\",\n" +
                "    \"boxes\": \"9.7,5.9,7.9,6.3,4.2,8.1\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": \"af265e1ec\",\n" +
                "    \"name\": \"Dell Technologies\",\n" +
                "    \"email\": \"contact@delltechnologies.com\",\n" +
                "    \"boxes\": \"7.2,0.2,9.4,0.8,8.3,1.7\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": \"2feb3a11006f\",\n" +
                "    \"name\": \"DuPont de Nemours\",\n" +
                "    \"email\": \"contact@dupontdenemours.com\",\n" +
                "    \"boxes\": \"7,7.9,3.5,0.2,1.3,4.6,9.8\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": \"b057a0df8d6\",\n" +
                "    \"name\": \"State Farm Insurance\",\n" +
                "    \"email\": \"contact@statefarminsurance.com\",\n" +
                "    \"boxes\": \"3.4,2.4,3.8,1.9,4.5,3.6\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": \"2ad7899b7e98\",\n" +
                "    \"name\": \"Johnson & Johnson\",\n" +
                "    \"email\": \"contact@johnsonjohnson.com\",\n" +
                "    \"boxes\": \"6\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": \"42a1280eda17b9c98a2e\",\n" +
                "    \"name\": \"IBM\",\n" +
                "    \"email\": \"contact@ibm.com\",\n" +
                "    \"boxes\": \"0.2,5.6,6.2,7.6,4,9.7,6.8,8.1\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": \"a89d54153433\",\n" +
                "    \"name\": \"Target\",\n" +
                "    \"email\": \"contact@target.com\",\n" +
                "    \"boxes\": \"7.6,7.7,8.5,3.7,7.2,8.1,1.7,8.7,5.1\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": \"370f9a5ed4d0b\",\n" +
                "    \"name\": \"Freddie Mac\",\n" +
                "    \"email\": \"contact@freddiemac.com\",\n" +
                "    \"boxes\": \"8.4,7.1,6.4,8.1,3.9,2.4,6.3,7.9,3.2\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": \"93da7de995b08a6954\",\n" +
                "    \"name\": \"United Parcel Service\",\n" +
                "    \"email\": \"contact@unitedparcelservice.com\",\n" +
                "    \"boxes\": \"7.7,7.1\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": \"eb417269d01b94b6bb\",\n" +
                "    \"name\": \"Lowe's\",\n" +
                "    \"email\": \"contact@lowe's.com\",\n" +
                "    \"boxes\": \"5.4,7.1,4.2,8.2,3.4,0.5\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": \"a2f4519a9d6a6\",\n" +
                "    \"name\": \"Intel\",\n" +
                "    \"email\": \"contact@intel.com\",\n" +
                "    \"boxes\": \"3.3,8.8,3.6,8.3,6.8,9.7,10\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": \"53fbce902e6\",\n" +
                "    \"name\": \"MetLife\",\n" +
                "    \"email\": \"contact@metlife.com\",\n" +
                "    \"boxes\": \"1,6.3,1.3,1.4,1.1,5,5.8,9.2,4.4,3.5\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": \"a79446aa3d0f53069\",\n" +
                "    \"name\": \"Procter & Gamble\",\n" +
                "    \"email\": \"contact@proctergamble.com\",\n" +
                "    \"boxes\": \"1.5,4.9,3.7,1.8,7.8,6.8,6.6,5,8.8\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": \"1e648063e1ff9b\",\n" +
                "    \"name\": \"United Technologies\",\n" +
                "    \"email\": \"contact@unitedtechnologies.com\",\n" +
                "    \"boxes\": \"1.9,9.1,3.1\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": \"de562ec18e99653\",\n" +
                "    \"name\": \"FedEx\",\n" +
                "    \"email\": \"contact@fedex.com\",\n" +
                "    \"boxes\": \"2.4,0.3,7.7,0.7\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": \"f2da3a0190\",\n" +
                "    \"name\": \"PepsiCo\",\n" +
                "    \"email\": \"contact@pepsico.com\",\n" +
                "    \"boxes\": \"5.9,3.5,0.1,6.8,6.9,0.5,8.8\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": \"7e5ce\",\n" +
                "    \"name\": \"Archer Daniels Midland\",\n" +
                "    \"email\": \"contact@archerdanielsmidland.com\",\n" +
                "    \"boxes\": \"6.9,2.3,7.9,7.4,7.5,1.2,5.3,0.5,3.8\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": \"e248936d8ba87d\",\n" +
                "    \"name\": \"Prudential Financial\",\n" +
                "    \"email\": \"contact@prudentialfinancial.com\",\n" +
                "    \"boxes\": \"7.1,0.1,0.3,7.8,0.4,2.6,1.9,1.5\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": \"6a824cf4427\",\n" +
                "    \"name\": \"Centene\",\n" +
                "    \"email\": \"contact@centene.com\",\n" +
                "    \"boxes\": \"4.7,7.9,2.3,6,4.3,0.8,9.4,0.4\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": \"b1ff60d14044191\",\n" +
                "    \"name\": \"Albertsons\",\n" +
                "    \"email\": \"contact@albertsons.com\",\n" +
                "    \"boxes\": \"2.5,7.6,3.3\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": \"ca9190\",\n" +
                "    \"name\": \"Walt Disney\",\n" +
                "    \"email\": \"contact@waltdisney.com\",\n" +
                "    \"boxes\": \"7.7\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": \"5539359fbcc075797\",\n" +
                "    \"name\": \"Sysco\",\n" +
                "    \"email\": \"contact@sysco.com\",\n" +
                "    \"boxes\": \"5.3,4.8,1,9.2,2.5,7.2,3.2\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": \"3d02043f4dff6d7\",\n" +
                "    \"name\": \"HP\",\n" +
                "    \"email\": \"contact@hp.com\",\n" +
                "    \"boxes\": \"3.1,7,7.9\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": \"5500b81ec173c1\",\n" +
                "    \"name\": \"Humana\",\n" +
                "    \"email\": \"contact@humana.com\",\n" +
                "    \"boxes\": \"9.2,9.7,3.4,6.1,9.6\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": \"f5244d8db1be7\",\n" +
                "    \"name\": \"Facebook\",\n" +
                "    \"email\": \"contact@facebook.com\",\n" +
                "    \"boxes\": \"4.4,2.8,2.3,7,5.2\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": \"0607e974be1fbb\",\n" +
                "    \"name\": \"Caterpillar\",\n" +
                "    \"email\": \"contact@caterpillar.com\",\n" +
                "    \"boxes\": \"3.4,7\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": \"ee81cf\",\n" +
                "    \"name\": \"Energy Transfer\",\n" +
                "    \"email\": \"contact@energytransfer.com\",\n" +
                "    \"boxes\": \"5.3,8,4.6,5.1,3.5,2.4,5.9,4.1,3.7,3.2\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": \"9ca806\",\n" +
                "    \"name\": \"Lockheed Martin\",\n" +
                "    \"email\": \"contact@lockheedmartin.com\",\n" +
                "    \"boxes\": \"1.7,3.6,9.3,8.7,0,0.3,6.6,1.8,2.3\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": \"e01590c\",\n" +
                "    \"name\": \"Pfizer\",\n" +
                "    \"email\": \"contact@pfizer.com\",\n" +
                "    \"boxes\": \"7,6.9,4.6,9\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": \"c4d5ce3730d32418bb\",\n" +
                "    \"name\": \"Goldman Sachs Group\",\n" +
                "    \"email\": \"contact@goldmansachsgroup.com\",\n" +
                "    \"boxes\": \"4.8,3.5,7.5,9.5,3.4,3.6,5.3,4.2,6.1,6.3\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": \"2b2083fb7309ac03c26\",\n" +
                "    \"name\": \"Morgan Stanley\",\n" +
                "    \"email\": \"contact@morganstanley.com\",\n" +
                "    \"boxes\": \"0.2,0.5\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": \"9a4887a0f\",\n" +
                "    \"name\": \"Cisco Systems\",\n" +
                "    \"email\": \"contact@ciscosystems.com\",\n" +
                "    \"boxes\": \"7,2.9,7.2,4.2\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": \"f8ddcaf7749f5a0\",\n" +
                "    \"name\": \"Cigna\",\n" +
                "    \"email\": \"contact@cigna.com\",\n" +
                "    \"boxes\": \"2.3,2.8,8.8\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": \"822819090a\",\n" +
                "    \"name\": \"AIG\",\n" +
                "    \"email\": \"contact@aig.com\",\n" +
                "    \"boxes\": \"6.9,0,2.4,3.4,1.8,6.7,8.1,3.9\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": \"e561b0205b8\",\n" +
                "    \"name\": \"HCA Healthcare\",\n" +
                "    \"email\": \"contact@hcahealthcare.com\",\n" +
                "    \"boxes\": \"2.3,3.6,9.7,5.1,3.1,7.5,7,0.5,1.5,7.1\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": \"d9a271b3de596a50\",\n" +
                "    \"name\": \"American Airlines Group\",\n" +
                "    \"email\": \"contact@americanairlinesgroup.com\",\n" +
                "    \"boxes\": \"9.8,1.8,2.2,4.2,9,1.7,0.2\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": \"333952df6e2537b4dce\",\n" +
                "    \"name\": \"Delta Air Lines\",\n" +
                "    \"email\": \"contact@deltaairlines.com\",\n" +
                "    \"boxes\": \"9.4,3.6,6.6,6,3.2\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": \"dd21317558dce6fe\",\n" +
                "    \"name\": \"Charter Communications\",\n" +
                "    \"email\": \"contact@chartercommunications.com\",\n" +
                "    \"boxes\": \"3.2,8.7,6.3,4.6,2.1,8.1,5.5,3.1\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": \"e8429f7987e4fb09\",\n" +
                "    \"name\": \"New York Life Insurance\",\n" +
                "    \"email\": \"contact@newyorklifeinsurance.com\",\n" +
                "    \"boxes\": \"3.8,4.6,7.4,7.8,1.8,7.3\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": \"ad8b78578\",\n" +
                "    \"name\": \"American Express\",\n" +
                "    \"email\": \"contact@americanexpress.com\",\n" +
                "    \"boxes\": \"9.8\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": \"42790d65a7d3b1c7cba8\",\n" +
                "    \"name\": \"Nationwide\",\n" +
                "    \"email\": \"contact@nationwide.com\",\n" +
                "    \"boxes\": \"6.8,3.3,0.6\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": \"7d51d4fc4\",\n" +
                "    \"name\": \"Best Buy\",\n" +
                "    \"email\": \"contact@bestbuy.com\",\n" +
                "    \"boxes\": \"3.3,5.3,3.2\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": \"98f533b3646a9bac5c5d\",\n" +
                "    \"name\": \"Liberty Mutual Insurance Group\",\n" +
                "    \"email\": \"contact@libertymutualinsurancegroup.com\",\n" +
                "    \"boxes\": \"2,8.7,7.1,8.4,6.3,2.8\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": \"21f0cb58e56ddba62a\",\n" +
                "    \"name\": \"Merck\",\n" +
                "    \"email\": \"contact@merck.com\",\n" +
                "    \"boxes\": \"8.2,1,7,0.3,9,6.2,8.5,9.9\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": \"70ccac904c\",\n" +
                "    \"name\": \"Honeywell International\",\n" +
                "    \"email\": \"contact@honeywellinternational.com\",\n" +
                "    \"boxes\": \"6.4,9.4,8.8\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": \"1146acdd5e8fbe3d8d03\",\n" +
                "    \"name\": \"United Continental Holdings\",\n" +
                "    \"email\": \"contact@unitedcontinentalholdings.com\",\n" +
                "    \"boxes\": \"5.7,4.5,5.1,7.5,4.8,0.6,8.5,9.7\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": \"44eaabdd5fc5ff17\",\n" +
                "    \"name\": \"TIAA\",\n" +
                "    \"email\": \"contact@tiaa.com\",\n" +
                "    \"boxes\": \"7.2,8.1,8.9,6.4,9.3,1.6,3.8,1.8\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": \"d3d7218aeca\",\n" +
                "    \"name\": \"Tyson Foods\",\n" +
                "    \"email\": \"contact@tysonfoods.com\",\n" +
                "    \"boxes\": \"0.3,0.7,3.6,0.9,4.4\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": \"50d4a8\",\n" +
                "    \"name\": \"Oracle\",\n" +
                "    \"email\": \"contact@oracle.com\",\n" +
                "    \"boxes\": \"0.5,1.1,8,0.3,6,9.9\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": \"6067c0e9f\",\n" +
                "    \"name\": \"Allstate\",\n" +
                "    \"email\": \"contact@allstate.com\",\n" +
                "    \"boxes\": \"5.5,0.1,3.4,5.4,8.2\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": \"11655eeb3700e1c\",\n" +
                "    \"name\": \"World Fuel Services\",\n" +
                "    \"email\": \"contact@worldfuelservices.com\",\n" +
                "    \"boxes\": \"2,5.9,9.5,9.4,2.4,0.3,8.3,5,6.5,3.6\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": \"01e96bb2196\",\n" +
                "    \"name\": \"Massachusetts Mutual Life Insurance\",\n" +
                "    \"email\": \"contact@massachusettsmutuallifeinsurance.com\",\n" +
                "    \"boxes\": \"5.9,6.2,5,7,8.2,10,9.7,8.8,8.7\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": \"8e86598a\",\n" +
                "    \"name\": \"TJX\",\n" +
                "    \"email\": \"contact@tjx.com\",\n" +
                "    \"boxes\": \"0.1,1.3,5.1,2.4,8.4,1.8,7.9\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": \"12c6d879b13a3\",\n" +
                "    \"name\": \"ConocoPhillips\",\n" +
                "    \"email\": \"contact@conocophillips.com\",\n" +
                "    \"boxes\": \"0.2,6.1,1.4\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": \"c7094\",\n" +
                "    \"name\": \"Deere\",\n" +
                "    \"email\": \"contact@deere.com\",\n" +
                "    \"boxes\": \"3.4,9.7,6.3,0.1\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": \"4fea09eee0ccdd091\",\n" +
                "    \"name\": \"Tech Data\",\n" +
                "    \"email\": \"contact@techdata.com\",\n" +
                "    \"boxes\": \"6.4,5.2,3.1,4.4,4.2,6.9,3,7.4,1.8,9.8\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": \"e013919244e66eb24d\",\n" +
                "    \"name\": \"Enterprise Products Partners\",\n" +
                "    \"email\": \"contact@enterpriseproductspartners.com\",\n" +
                "    \"boxes\": \"5,2.3,6.1\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": \"c42026b\",\n" +
                "    \"name\": \"Nike\",\n" +
                "    \"email\": \"contact@nike.com\",\n" +
                "    \"boxes\": \"5.6,9.2,1.1,5.5\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": \"d6b25ce2f77b3\",\n" +
                "    \"name\": \"Publix Super Markets\",\n" +
                "    \"email\": \"contact@publixsupermarkets.com\",\n" +
                "    \"boxes\": \"8.5,3.6\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": \"907d7bf\",\n" +
                "    \"name\": \"General Dynamics\",\n" +
                "    \"email\": \"contact@generaldynamics.com\",\n" +
                "    \"boxes\": \"0.4\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": \"0261ea79eb\",\n" +
                "    \"name\": \"Exelon\",\n" +
                "    \"email\": \"contact@exelon.com\",\n" +
                "    \"boxes\": \"8.4,7.3,7.8,1.2,2.7,2.5,3.8,7.6\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": \"96d162f0\",\n" +
                "    \"name\": \"Plains GP Holdings\",\n" +
                "    \"email\": \"contact@plainsgpholdings.com\",\n" +
                "    \"boxes\": \"0.4\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": \"2850220be6d47d9096d\",\n" +
                "    \"name\": \"3M\",\n" +
                "    \"email\": \"contact@m.com\",\n" +
                "    \"boxes\": \"6.3,8.9,1,5.8,5.2,3.9\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": \"0b75ec4012ad4\",\n" +
                "    \"name\": \"AbbVie\",\n" +
                "    \"email\": \"contact@abbvie.com\",\n" +
                "    \"boxes\": \"2.6,0.4,4.8,5\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": \"ac50191a3235d575ef\",\n" +
                "    \"name\": \"CHS\",\n" +
                "    \"email\": \"contact@chs.com\",\n" +
                "    \"boxes\": \"4.1,4.5,6.8,1,8.2,4,9.7,0.6,9.3\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": \"474c801\",\n" +
                "    \"name\": \"Capital One Financial\",\n" +
                "    \"email\": \"contact@capitalonefinancial.com\",\n" +
                "    \"boxes\": \"0,1.4,1.8,9.7,7.9\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": \"538a195491873c\",\n" +
                "    \"name\": \"Progressive\",\n" +
                "    \"email\": \"contact@progressive.com\",\n" +
                "    \"boxes\": \"0.4,8.3,4.1,6.6\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": \"a3113ba5a07c\",\n" +
                "    \"name\": \"Coca-Cola\",\n" +
                "    \"email\": \"contact@cocacola.com\",\n" +
                "    \"boxes\": \"4.6,5.7,4.3,9.9,3.2,5.9,8.5,5.4,1.5,0.3\"\n" +
                "  }\n" +
                "]";
    }
}
