public class dosen extends pegawai {
        private float sks;

        public dosen() {
            super();
        }

        public dosen(String nama, String nip, long GajiPokok) {
            super();
        }


        public void setsks(float sks) {
            this.sks = sks;
        }

        public float getsks() {
            return sks;
        }

        public float hitungGajiTotal() {
            return GajiPokok + sks;
        }
    }

