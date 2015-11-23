package koter.peter

import spock.lang.Specification

import static koter.peter.GeometricGamesClass.*

/**
 * This is a test for 4 different geometric forms
 * (Cuboid, Square Pyramid, Hexagonal Prism and Dodecahedron) volume calculator
 */

class GeometricGamesTest extends Specification {
    /*@formatter:off*/

    def almostEqual(expectedResult, result) {
        Math.abs(expectedResult - result) < 0.1
    }

    def 'Cuboid Volume Volume Calculator Test'() {
        when: def cuboidVolumeCalculator = cuboidVolume(height, length, depth)
        then: almostEqual(cuboidVolumeCalculator, result)

        where:  height | length | depth || result
                2      | 4      | 3     || 24
                7      | 13     | 4     || 364
    }

    def 'Square Pyramid Volume Calculator Test'() {
        when: def squarePyramidVolumeCalculator = squarePyramidVolume(baseEdge, height)
        then: almostEqual(squarePyramidVolumeCalculator, result)

        where:  baseEdge | height || result
                4        | 12     || 64
                8        | 23     || 490.6
    }

    def 'Hexagonal Prism Volume Calculator Test'() {
        when: def hexagonalPrismVolumeCalculator = hexagonalPrismVolume(baseEdge, height)
        then: almostEqual(hexagonalPrismVolumeCalculator, result)

        where:  baseEdge | height || result
                4        | 12     || 498.8
                8        | 26     || 4323.2
    }

    def 'Dodecahedron Volume Calculator Test'() {
        when: def dodecahedronVolumeCalculator = dodecahedronVolume(edge)
        then: almostEqual(dodecahedronVolumeCalculator, result)

        where:  edge || result
                4    || 490.4
                8    || 3923.5

        /*@formatter:on*/
    }
}