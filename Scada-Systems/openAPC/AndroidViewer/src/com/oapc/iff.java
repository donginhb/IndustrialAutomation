package com.oapc;

public class iff 
{
   public static final String CHUNK_FORM           ="FORM"; // IFF

   public static final String CHUNK_ANNO           ="ANNO";
   public static final String CHUNK_APCP           ="APCP"; // project file
   public static final String CHUNK_APCX           ="APCX"; // compiled project file
   public static final String CHUNK_APRT           ="APRT"; // runtime data file
   public static final String CHUNK_GPRJ           ="GPRJ"; // group project data
   public static final String CHUNK_HOBL           ="HOBL"; // hmi object list
   public static final String CHUNK_NAME           ="NAME";
   public static final String CHUNK_PROJ           ="PROJ"; // project data
   public static final String CHUNK_VERS           ="VERS";
   public static final String CHUNK_USPR           ="USPR"; // user privilege information
   public static final String CHUNK_USDA           ="USDA"; // user data

   public static final String CHUNK_HOBL_ADPA      ="ADPA"; // additional panel
   public static final String CHUNK_HOBL_ANME      ="ANME"; // angular meter
   public static final String CHUNK_HOBL_ANRE      ="ANRE"; // angular regulator
   public static final String CHUNK_HOBL_CKBX      ="CKBX"; // chekbox
   public static final String CHUNK_HOBL_EXHM      ="EXHM"; // external HMI plug in
   public static final String CHUNK_HOBL_FLTF      ="FLTF";
   public static final String CHUNK_HOBL_HGAG      ="HGAG";
   public static final String CHUNK_HOBL_HSLD      ="HSLD";
   public static final String CHUNK_HOBL_IMAG      ="IMAG";
   public static final String CHUNK_HOBL_IMBU      ="IMBU";
   public static final String CHUNK_HOBL_LCDN      ="LCDN"; // LCD Number
   public static final String CHUNK_HOBL_LINE      ="LINE";
   public static final String CHUNK_HOBL_MTXL      ="MTXL"; // mutex list
   public static final String CHUNK_HOBL_NUMF      ="NUMF";
   public static final String CHUNK_HOBL_PWDF      ="PWDF"; // password input field
   public static final String CHUNK_HOBL_RABU      ="RABU";
   public static final String CHUNK_HOBL_SIBU      ="SIBU";
   public static final String CHUNK_HOBL_SIPA      ="SIPA";
   public static final String CHUNK_HOBL_STPA      ="STPA";
   public static final String CHUNK_HOBL_TAPA      ="TAPA";
   public static final String CHUNK_HOBL_TELA      ="TELA";
   public static final String CHUNK_HOBL_TOBU      ="TOBU";
   public static final String CHUNK_HOBL_TOIB      ="TOIB";
   public static final String CHUNK_HOBL_TXTF      ="TXTF";
   public static final String CHUNK_HOBL_UMGM      ="UMGM"; // special panel for user management
   public static final String CHUNK_HOBL_VGAG      ="VGAG";
   public static final String CHUNK_HOBL_VSLD      ="VSLD";
   public static final String CHUNK_FLOW           ="FLOW"; // flow list
   public static final String CHUNK_FLOW_BCTR      ="BCTR"; // binary element counter
   public static final String CHUNK_FLOW_BGTE      ="BGTE"; // binary gate
   public static final String CHUNK_FLOW_BTGT      ="BTGT"; // binary triggered gate
   public static final String CHUNK_FLOW_CCMP      ="CCMP"; // compare characters
   public static final String CHUNK_FLOW_CCTR      ="CCTR"; // character element counter
   public static final String CHUNK_FLOW_CGTE      ="CGTE"; // character gate
   public static final String CHUNK_FLOW_CTGT      ="CTGT"; // character triggered gate
   public static final String CHUNK_FLOW_CVCD      ="CVCD"; // converter char2digi
   public static final String CHUNK_FLOW_CVCN      ="CVCN"; // converter char2num
   public static final String CHUNK_FLOW_CVDC      ="CVDC"; // converter digi2char
   public static final String CHUNK_FLOW_CVDN      ="CVDN"; // converter digi2num
   public static final String CHUNK_FLOW_CVMC      ="CVMC"; // converter mixed2char
   public static final String CHUNK_FLOW_CVNB      ="CVNB"; // converter num2bits
   public static final String CHUNK_FLOW_CVNC      ="CVNC"; // converter num2char
   public static final String CHUNK_FLOW_CVND      ="CVND"; // converter num2digi
   public static final String CHUNK_FLOW_CVBP      ="CVBP"; // converter bin2pair
   public static final String CHUNK_FLOW_CVCP      ="CVCP"; // converter char2pair
   public static final String CHUNK_FLOW_CVDP      ="CVDP"; // converter digi2pair
   public static final String CHUNK_FLOW_CVNP      ="CVNP"; // converter num2pair
   public static final String CHUNK_FLOW_CVPB      ="CVPB"; // converter pair2bin
   public static final String CHUNK_FLOW_CVPC      ="CVPC"; // converter pair2char
   public static final String CHUNK_FLOW_CVPD      ="CVPD"; // converter pair2digi
   public static final String CHUNK_FLOW_CVPN      ="CVPN"; // converter pair2num
   public static final String CHUNK_FLOW_DCMP      ="DCMP"; // compare digital
   public static final String CHUNK_FLOW_DCTR      ="DCTR"; // digital element counter
   public static final String CHUNK_FLOW_DGTE      ="DGTE"; // digital gate
   public static final String CHUNK_FLOW_DTGT      ="DTGT"; // digital triggered gate
   public static final String CHUNK_FLOW_EXIO      ="EXIO"; // flow of an external IO plugin
   public static final String CHUNK_FLOW_FDLY      ="FDLY"; // flow delay
   public static final String CHUNK_FLOW_FGRP      ="FGRP"; // flow of a flow group
   public static final String CHUNK_FLOW_FGRP_GRPD ="GRPD"; // group definitions
   public static final String CHUNK_FLOW_FGRP_GRPI ="GRPI"; // group inputs
   public static final String CHUNK_FLOW_FGRP_GRPO ="GRPO"; // group outputs
   public static final String CHUNK_FLOW_FSTA      ="FSTA"; // flow start / initial program flow begin
   public static final String CHUNK_FLOW_FSTP      ="FSTP"; // flow stop / application exit
   public static final String CHUNK_FLOW_FTMR      ="FTMR"; // flow started by timer
   public static final String CHUNK_MISC_ISCO      ="ISCO"; // interlock server connection
   public static final String CHUNK_FLOW_LBSF      ="LBSF"; // logic binary shift register
   public static final String CHUNK_FLOW_LCSF      ="LCSF"; // logic char shift register
   public static final String CHUNK_FLOW_LDSF      ="LDSF"; // logic digital shift register
   public static final String CHUNK_FLOW_LGBP      ="LGBP"; // logic binary NOP
   public static final String CHUNK_FLOW_LGCP      ="LGCP"; // logic characer NOP
   public static final String CHUNK_FLOW_LGDA      ="LGDA"; // logic digital AND
   public static final String CHUNK_FLOW_LGDN      ="LGDN"; // logic digital NOT
   public static final String CHUNK_FLOW_LGDO      ="LGDO"; // logic digital OR
   public static final String CHUNK_FLOW_LGDP      ="LGDP"; // logic digital NOP
   public static final String CHUNK_FLOW_LGDX      ="LGDX"; // logic digital XOR
   public static final String CHUNK_FLOW_LGNA      ="LGNA"; // logic numeric AND
   public static final String CHUNK_FLOW_LGNN      ="LGNN"; // logic numeric NOT
   public static final String CHUNK_FLOW_LGNO      ="LGNO"; // logic numeric OR
   public static final String CHUNK_FLOW_LGNP      ="LGNP"; // logic numeric NOP
   public static final String CHUNK_FLOW_LGNX      ="LGNX"; // logic numeric XOR
   public static final String CHUNK_FLOW_LNSF      ="LNSF"; // logic numeric shift register
   public static final String CHUNK_MISC_LOGO      ="LOGO"; // log output
   public static final String CHUNK_MISC_LOGR      ="LOGR"; // log recorder
   public static final String CHUNK_FLOW_LRSF      ="LRSF"; // logic RS flipflop
   public static final String CHUNK_FLOW_LTFF      ="LTFF"; // logic toggle flipflop
   public static final String CHUNK_FLOW_MAAD      ="MAAD"; // mathematical addition
   public static final String CHUNK_FLOW_MADI      ="MADI"; // mathematical division
   public static final String CHUNK_FLOW_MAMU      ="MAMU"; // mathematical multiplication
   public static final String CHUNK_FLOW_MASU      ="MASU"; // mathematical subtraction
   public static final String CHUNK_FLOW_NCMP      ="NCMP"; // compare numbers
   public static final String CHUNK_FLOW_NCTR      ="NCTR"; // numerical element counter
   public static final String CHUNK_FLOW_NGTE      ="NGTE"; // numerical gate
   public static final String CHUNK_FLOW_NTGT      ="NTGT"; // numerical triggered gate
   public static final String CHUNK_FLOW_SOBJ      ="SOBJ"; // flow of a hmi object
   public static final String CHUNK_MISC_USLI      ="USLI"; // user log in
   public static final String CHUNK_DEVL           ="DEVL"; // device list

   public static final String CHUNK_APCG           ="APCG"; // type group file
   public static final String CHUNK_GRMM           ="GRMM"; // minimum and maximum IDs within the saved group

}