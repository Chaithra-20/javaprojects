package com.emphibernate;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class laptop {
		
		@Id
		private int lapId;
		private String lapName;
		public int getLapId() {
			return lapId;
		}
		public void setLapId(int lapId) {
			this.lapId = lapId;
		}
		public String getLapName() {
			return lapName;
		}
		public void setLapName(String lapName) {
			this.lapName = lapName;
		}
		@Override
		public String toString() {
			return "laptop [lapId=" + lapId + ", lapName=" + lapName + "]";
		}
		
}
