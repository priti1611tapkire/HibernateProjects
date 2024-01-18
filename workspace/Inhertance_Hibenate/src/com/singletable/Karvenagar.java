package com.singletable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@DiscriminatorValue(value = "KARVE")
public class Karvenagar extends Cjc {

private String regularbatch;

public String getRegularbatch() {
	return regularbatch;
}

public void setRegularbatch(String regularbatch) {
	this.regularbatch = regularbatch;
}

@Override
public String toString() {
	return "Karvenagar [regularbatch=" + regularbatch + "]";
}

}
