/*
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package fr.ybo.gtfs.csv.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import fr.ybo.gtfs.csv.moteur.adapter.AdapterCsv;
import fr.ybo.gtfs.csv.moteur.adapter.AdapterString;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface BaliseCsv {

	Class<? extends AdapterCsv<?>> adapter() default AdapterString.class;

	String value();
}