public class staff extends pegawai{
        private int JamLembur;

        public staff(){
            super();
        }

        public void staff(String nip){
            super.setNip(nip);
        }

        public void setJamLembur(int JamLembur){
            this.JamLembur = JamLembur;
        }

        public int getJamLembur(){
            return JamLembur;
        }
        public float hitungGajiTotal(){
            return GajiPokok + JamLembur*50000;
        }
}
