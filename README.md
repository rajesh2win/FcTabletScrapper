# FcTabletScrapper
Write a scraper for Flipkart that downloads specs and prices of all Tablets from Flipkart and stores the details 
(Specs and prices) in a flat file (tilde separated). You can use any technology stack that you are comfortable with.
Flipkart tablet scrapper

Used Jsoup library to scrap the HTML Document Elements

Input URL : http://www.flipkart.com/tablets/pr?sid=tyy,hry&otracker=ch_vn_tablet_filter_Brands_ALL
Output : Digiflip Pro XT811 Tablet (Space Blue, 16 GB, Wi-Fi+3G)~~~ Rs. 8,499 EMI from Rs. 413 Voice-calling 4200 mAh Li-Po Battery Intel Atom Z2580 8 inch HD IPS Display 
iBall Slide i701 Tablet with 3 Protective Covers and HD...~~~ Rs. 4,854 EMI from Rs. 236 15 Sellers from Rs 4,750 Windows 8.1 OS 1.83 GHz Intel Quad ... 16GB Expandable to 6... 7 inch IPS Display 
Dell Venue 7 3740 Tablet (Black, 16 GB, 3G, Voice Calli...~~~ Rs. 9,100 EMI from Rs. 442 Android v4.4 OS 5 MP Primary Camera 7 inch Touchscreen 1.6 GHz Processor 

Business Process : Scrap the data based on xPath, id  and css styles attributes.
